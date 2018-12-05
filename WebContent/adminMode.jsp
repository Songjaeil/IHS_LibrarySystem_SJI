<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>관리자모드 입니다.</h1>
	<table>
		<tr>
			<td colspan="2"><input type="text" size="20" name="searchForm"></td>
			<td><input type="submit" value="검색"></td>
		</tr>
		<tr>
			<td><a href="notices.lib">공지사항</a></td>
			<td><a href="reviews.lib">후기</a></td>
			<td><a href="qnas.lib">QnA/구매요청</a></td>
		</tr>
		<tr>
			<td><a href="reservedList.lib">예약목록</a></td>
			<td><a href="insertBooks.lib">책 등록</a></td>
			<td><a href="membersManagement.lib">회원관리</a></td>
		</tr>
		
	</table>
</body>
</html>