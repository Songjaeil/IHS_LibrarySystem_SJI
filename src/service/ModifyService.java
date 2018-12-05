package service;

import java.sql.*;
import static db.JdbcUtil.*;
import dao.MemberDAO;
import vo.Members;

public class ModifyService {

	public Members memberModify(String id) {
		boolean modifyResult = false;
		Connection con = getConnection();
		MemberDAO memberDAO = MemberDAO.getInstance();
		memberDAO.setConnection(con);
//		Members member = memberDAO.Modify(id);
//		modifyResult = memberDAO.Modify(id);
		close(con);
		return null;
	}

}
