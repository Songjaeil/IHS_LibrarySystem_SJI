package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import service.MemberLoginService;
import vo.ActionForward;
import vo.Members;

public class MemberLoginAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Members member = new Members();

		String id = request.getParameter("ID");
		String password = request.getParameter("PASSWORD");
		System.out.println(id);
		System.out.println(password);
		member.setMEMBER_ID(id);
		member.setMEMBER_PASSWORD(password);

		MemberLoginService memberLoginService = new MemberLoginService();
		boolean loginId = memberLoginService.memberLogin(member);

		ActionForward forward = null;
		if (loginId) {
			forward = new ActionForward();
			HttpSession session = request.getSession();
			session.setAttribute("ID", id);
			forward.setRedirect(true);
			forward.setPath("./main.jsp");
		} else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('로그인실패')");
			out.println("location.href='./memberLogin.lib'</script>");
		}
		return forward;
	}

}
