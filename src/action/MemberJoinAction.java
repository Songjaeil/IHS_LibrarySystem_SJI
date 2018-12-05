package action;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.MemberJoinService;
import vo.ActionForward;
import vo.Members;

public class MemberJoinAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Members member = new Members();
		MemberJoinService memberJoinService = new MemberJoinService();
		boolean joinResult = false;

		member.setMEMBER_ID(request.getParameter("ID"));
		member.setMEMBER_PASSWORD(request.getParameter("PASSWORD"));
		member.setMEMBER_NAME(request.getParameter("NAME"));
		member.setMEMBER_AGE(Integer.parseInt(request.getParameter("AGE")));
		member.setMEMBER_ADDRESS(request.getParameter("ADDRESS"));
		// genre는 체크박스로 박스별로 숫자를 지정해야 한다.
		String[] genres = request.getParameterValues("GENRE");
		String genre = "";
		for (int i = 0; i < genres.length; i++) {
			genre += genres[i] + " ";
		}
		member.setMEMBER_GENRE(genre);

		System.out.println(request.getParameter("ID"));
		System.out.println(request.getParameter("PASSWORD"));
		System.out.println(request.getParameter("NAME"));
		System.out.println(Integer.parseInt(request.getParameter("AGE")));
		System.out.println(request.getParameter("ADDRESS"));
		System.out.println(request.getParameter("GENRE"));

		joinResult = memberJoinService.memberJoin(member);
		ActionForward forward = null;
		if (joinResult == false) {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('아이디가 중복되었습니다.')");
			out.println("history.back()</script>");
		} else {
			System.out.println("회원가입");
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./main.jsp");
		}
		return forward;
	}
}
