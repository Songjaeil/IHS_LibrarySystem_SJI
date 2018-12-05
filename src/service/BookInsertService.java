package service;

import java.sql.*;
import static db.JdbcUtil.*;

import dao.MemberDAO;
import vo.Books;

public class BookInsertService {
	public boolean bookInsert(Books book) {
		MemberDAO memberDAO = MemberDAO.getInstance();
		Connection con = getConnection();
		memberDAO.setConnection(con);

		boolean insertResult = false;
		int result = memberDAO.bookInsert(book);
		if (result > 0) {
			insertResult = true;
			commit(con);
		} else {
			insertResult = false;
			rollback(con);
		}

		close(con);
		return insertResult;
	}

}
