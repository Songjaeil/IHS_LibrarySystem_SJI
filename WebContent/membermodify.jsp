<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="vo.Members"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정 페이지</title>
</head>
<body>
	<form name="membermodify" action="./modify.lib" method="post">
		<table>
			<tr>
				<td>아이디 :</td>
				<td>${member.MEMBER_ID }</td>
			</tr>
			<tr>
				<td>비밀번호 :</td>
				<td><input type="password" name="MEMBER_PASSWORD"
					id="MEMBER_PASSWORD" value="${member.MEMBER_PASSWORD }"></td>
			</tr>
			<tr>
				<td>이름 :</td>
				<td><input type="text" name="MEMBER_NAME" id="MEMBER_NAME"
					value="${member.MEMBER_NAME }"></td>
			</tr>
			<tr>
				<td>나이 :</td>
				<td><input type="text" name="MEMBER_AGE" id="MEMBER_AGE"
					value="${member.MEMBER_AGE }"></td>
			</tr>
			<tr>
				<td>주소 :</td>
				<td><input type="text" name="MEMBER_ADDRESS"
					id="MEMBER_ADDRESS" value="${member.MEMBER_ADDRESS }"></td>
			</tr>
			<tr>
				<td>포인트 :</td>
				<td>${member.MEMBER_POINT }</td>
			</tr>
		</table>
		<table>
			<tr>
				<td><a href="javascript:membermodify.submit()">[수정]</a>
				<td><a href="main.jsp">[메인페이지]</a> <a
					href="javascript:membermodify.reset()">다시작성</a>
		</table>
	</form>
</body>
</html>