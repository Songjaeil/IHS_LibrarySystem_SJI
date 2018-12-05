<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h1>회원가입 페이지</h1>
	<form name="joinform" action="./memberJoinAction.lib" method="post">
		아이디 : <input type="text" name='ID' id='id'><br> 비밀번호 : <input
			type="password" name='PASSWORD' id='password'><br> 이름 :
		<input type="text" name='NAME' id='name'><br> 나이 : <input
			type="text" name='AGE' id='age'><br> 주소 : <input
			type="text" name='ADDRESS' id='text'><br>
		<!-- genre는 체크박스로 박스별로 숫자를 지정해야 한다. -->
		선호장르 <br> <input type="checkbox" name='GENRE' value="1">문학
		<input type="checkbox" name="GENRE" value="2">자기계발 <input
			type="checkbox" name="GENRE" value="3">과학 <input
			type="checkbox" name="GENRE" value="4">예술 <input
			type="checkbox" name="GENRE" value="5">철학 <input
			type="checkbox" name="GENRE" value="6">판타지<input
			type="checkbox" name="GENRE" value="7">건강 <input
			type="checkbox" name="GENRE" value="8">기타(만화,잡지 등) <br>
		<a href="javascript:joinform.submit()">회원가입</a>&nbsp;&nbsp; <a
			href="javascript:joinform.reset()">다시작성</a><br>
	</form>
</body>
</html>