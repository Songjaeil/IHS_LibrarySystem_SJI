package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.Action;
import action.MemberModifyAction;
import action.ModifyAction;
import action.MemberJoinAction;
import action.MemberLoginAction;
import action.QnaAction;
import vo.ActionForward;

@WebServlet("*.lib")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberController() {
		super();
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		ActionForward forward = null;
		Action action = null;

		if (command.equals("/memberJoinAction.lib")) {
			action = new MemberJoinAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/memberJoin.lib")) {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./joinForm.jsp");
		} else if (command.equals("/memberLoginAction.lib")) {
			action = new MemberLoginAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/memberLogin.lib")) {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./loginForm.jsp");
		} else if (command.equals("/memberLogout.lib")) {
			HttpSession session = request.getSession();
			session.invalidate();
			response.sendRedirect("main.jsp");
		} else if (command.equals("/qnas.lib")) {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./qnas.jsp");
		} else if (command.equals("/qnasAcition.lib")) {
			action = new QnaAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/membermodify.lib")) {
			System.out.println("회원정보수정");
			action = new MemberModifyAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/modify.lib")) {
			System.out.println("회원정보수정");
			action = new ModifyAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/insertBook.lib")) {
			System.out.println("야호 성공이다");
		}

		if (forward != null) {
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}
}
