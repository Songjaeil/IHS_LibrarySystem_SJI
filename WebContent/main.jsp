<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="vo.Members"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Library System_main</title>
</head>
<body>
	<table>
		<tr>
			<td>
				<%
					String id = (String) session.getAttribute("ID");
					if (id == null) {
				%> <a href="./loginForm.jsp">로그인</a> <a href="./joinForm.jsp">회원
					가입</a> <%
 	} else {
 %> <%=session.getAttribute("ID")%> &nbsp;&nbsp;<a href="./myPage.jsp">내
					정보</a>&nbsp;&nbsp; <a href="memberLogout.lib">로그아웃</a> <%
 	}
 %>
			</td>
		</tr>
	</table>

	<form name="searchForm" action="search.lib">
		<table>
			<tr>
				<td><select name="opt">
						<option value="0">제목</option>
						<option value="1">내용</option>
						<option value="2">제목+내용</option>
						<option value="3">글쓴이</option>
				</select> <input type="text" size="20" name="searchForm">&nbsp;<input
					type="submit" value="검색"></td>
			</tr>
		</table>
	</form>
	<tr>
		<td><a href="notices.lib">공지사항</a>&nbsp;&nbsp;&nbsp;<a
			href="reviews.lib">후기</a> &nbsp;&nbsp;&nbsp;<a href="qnas.lib">QnA
				/ 구매요청</a></td>
	</tr>
	</table>
</body>
</html>