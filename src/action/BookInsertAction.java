package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BookInsertService;
import vo.ActionForward;
import vo.Books;

public class BookInsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Books book = new Books();
		BookInsertService bookInsertService = new BookInsertService();
		book.setBOOK_ID(request.getParameter("BOOK_ID"));
		book.setBOOK_STOCK(Integer.parseInt(request.getParameter("BOOK_STOCK")));
		book.setBOOK_ID(request.getParameter("BOOK_NAME"));
		book.setBOOK_STOCK(Integer.parseInt(request.getParameter("BOOK_PRICE")));
		book.setBOOK_STOCK(Integer.parseInt(request.getParameter("BOOK_RENTALPRICE")));
		book.setBOOK_ID(request.getParameter("BOOK_AUTHOR"));
		book.setBOOK_ID(request.getParameter("BOOK_PUBLISHER"));

		boolean insertResult = false;
		insertResult = bookInsertService.bookInsert(book);

		ActionForward forward = null;
		if (insertResult == false) {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('도서 등록 실패')");
			out.println("history.back()</script>");
		} else {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./insertBooks.jsp");
		}
		return forward;
	}

}
