package service;

import java.sql.*;
import static db.JdbcUtil.*;
import dao.MemberDAO;
import vo.Members;

public class MemberModifyService {

	public Members memberModify(String id) {
		Connection con = getConnection();
		MemberDAO memberDAO = MemberDAO.getInstance();
		memberDAO.setConnection(con);
		Members member = memberDAO.memberModify(id);
		close(con);
		return member;
	}
}
