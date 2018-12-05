package dao;

import java.sql.*;

import vo.Books;
import vo.Members;
import static db.JdbcUtil.*;

public class MemberDAO {
	private static MemberDAO memberDAO;
	private Connection con;
	PreparedStatement pstmt;
	ResultSet rs;

	private MemberDAO() {
	}

	public static MemberDAO getInstance() {
		if (memberDAO == null) {
			memberDAO = new MemberDAO();
		}
		return memberDAO;
	}

	public void setConnection(Connection con) {
		this.con = con;
	}

	public int memberJoin(Members member) {
		String sql = "INSERT INTO MEMBERS VALUES (?,?,?,?,?,0,?)";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getMEMBER_ID());
			System.out.println("id");
			pstmt.setString(2, member.getMEMBER_PASSWORD());
			System.out.println("pw");
			pstmt.setString(3, member.getMEMBER_NAME());
			System.out.println("name");
			pstmt.setInt(4, member.getMEMBER_AGE());
			System.out.println("age");
			pstmt.setString(5, member.getMEMBER_ADDRESS());
			System.out.println("address");
			pstmt.setString(6, member.getMEMBER_GENRE());
			System.out.println("genre");
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("memberJoin 오류!!" + e);
		} finally {
			close(pstmt);
		}
		return result;
	}

	public String memberLogin(Members member) {
		String loginId = null;
		String sql = "SELECT MEMBER_ID FROM MEMBERS WHERE MEMBER_ID=? AND MEMBER_PASSWORD=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getMEMBER_ID());
			pstmt.setString(2, member.getMEMBER_PASSWORD());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				loginId = rs.getString("MEMBER_ID");
				System.out.println("DB에서 조회한 id : " + loginId);
			}
		} catch (Exception e) {
			System.out.println("memberLogin 오류 : " + e);
		} finally {
			close(pstmt);
			close(rs);
		}
		return loginId;
	}

	public Members memberModify(String id) {
		Members member = null;
		String sql = "SELECT * FROM MEMBERS WHERE MEMBER_ID=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				member = new Members();
				member.setMEMBER_ID(rs.getString("MEMBER_ID"));
				member.setMEMBER_PASSWORD(rs.getString("MEMBER_PASSWORD"));
				member.setMEMBER_NAME(rs.getString("MEMBER_NAME"));
				member.setMEMBER_AGE(rs.getInt("MEMBER_AGE"));
				member.setMEMBER_ADDRESS(rs.getString("MEMBER_ADDRESS"));
				member.setMEMBER_POINT(rs.getInt("MEMBER_POINT"));
				member.setMEMBER_GENRE(rs.getString("MEMBER_GENRE"));

				System.out.println("DB에서 조회한 password : " + id);
			}
		} catch (Exception e) {
			System.out.println("memberIdenfication 오류 : " + e);
		} finally {
			close(pstmt);
			close(rs);
		}
		return member;
	}

	public int Modify(String id) {
		int updateCount = 0;
		Members member = null;
		String sql = "UPDATE MEMBERS SET MEMBER_PASSWORD=?,MEMBER_NAME=?,MEMBER_AGE=?,MEMBER_ADDRESS=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getMEMBER_PASSWORD());
			pstmt.setString(2, member.getMEMBER_NAME());
			pstmt.setInt(3, member.getMEMBER_AGE());
			pstmt.setString(4, member.getMEMBER_ADDRESS());

			updateCount = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("memberIdenfication 오류 : " + e);
		} finally {
			close(pstmt);
			close(rs);
		}
		return updateCount;
	}

	public int bookInsert(Books book) {
		String sql = "INSERT INTO BOOKS VALUES (?,?,?,?,?,?,?)";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, book.getBOOK_ID());
			pstmt.setInt(2, book.getBOOK_STOCK());
			pstmt.setString(3, book.getBOOK_NAME());
			pstmt.setInt(4, book.getBOOK_PRICE());
			pstmt.setInt(5, book.getBOOK_RENTALPRICE());
			pstmt.setString(6, book.getBOOK_AUTHOR());
			pstmt.setString(7, book.getBOOK_PUBLISHER());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("memberJoin 오류!!" + e);
		} finally {
			close(pstmt);
		}
		return result;
	}
}
