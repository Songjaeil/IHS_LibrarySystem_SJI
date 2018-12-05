<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Library_System_Login</title>
</head>
<body>
	<form name="loginform" action="./memberLoginAction.lib" method="post">
		<table>
			<tr>
				<td>아이디 : <input type="text" id="id" name="ID"></td>
				<td>비밀번호 : <input type="password" name="PASSWORD" id="password"></td>
				<td><a href="javascript:loginform.submit()">로그인</a>&nbsp;&nbsp;
					<a href="memberJoin.lib">회원가입</a>
			</tr>
		</table>
	</form>
</body>
</html>