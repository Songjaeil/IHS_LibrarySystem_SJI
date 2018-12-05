package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import action.Action;
import service.ModifyService;
import vo.ActionForward;
import vo.Members;

public class ModifyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Members member = new Members();
		HttpSession session = request.getSession();
		ActionForward forward = null;

		String id = (String) session.getAttribute("ID");
		System.out.println(id);

		if (id == null) {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./main.jsp");
		} else {
			forward = new ActionForward();
			ModifyService IdentificationService = new ModifyService();
			member = IdentificationService.memberModify(id);
			
			
			
			
			request.setAttribute("member", member);
			forward.setPath("myPage.jsp");
		}
		return forward;
	}

}
