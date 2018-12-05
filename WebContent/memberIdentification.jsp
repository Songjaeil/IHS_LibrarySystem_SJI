<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="vo.Members"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>본인 확인 페이지</title>
</head>
<body>
	<form name="membermodifyForm" action="memberIdentification.lib"
		method="post">
		<table>
			<tr>
				<td>아이디 : <%=session.getAttribute("ID")%></td>
			</tr>
			<tr>
				<td>비밀번호 확인 : <input type="password" name="MEMBER_PASSWORD"
					id="MEMBER_PASSWORD"></td>
			</tr>
		</table>
		<section>
			<a href="javascript:membermodifyForm()">[확인]</a>&nbsp;&nbsp;<a
				href="javascript:history.go(-1)">[뒤로]</a>
		</section>
	</form>
</body>
</html>