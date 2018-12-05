<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="vo.Books"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		ArrayList<Books> reservedBooks = (ArrayList<Books>) request.getAttribute("reservedBooks");
	%>
	<%
		ArrayList<Books> rentedBooks = (ArrayList<Books>) request.getAttribute("rentedBooks");
	%>
	<h1>도서 렌탈</h1>
	<h2>예약신청된 도서 목록 : Books의 BOOK_STOCK값이 -1이다.</h2>
	<table border="1">
		<tr>
			<td>BOOK_ID</td>
			<td>BOOK_NAME</td>
			<td>BOOK_RENTAL_PERIOD</td>
			<td>BOOK_STOCK</td>
		</tr>
		<c:forEach var="reservaion" items="${reservedBooks }">
			<tr>
				<td>${reservation.BOOK_ID }</td>
				<td>${reservation.BOOK_NAME }</td>
				<td>${reservation.BOOK_RENTAL_PERIOD }</td>
				<td>${reservation.BOOK_STOCK }</td>
			</tr>
		</c:forEach>
	</table>
	<h2>대여중인 도서 목록 : Books의 BOOK_STOCK값이 0이다.</h2>
	<table border="1">
		<tr>
			<td>BOOK_ID</td>
			<td>BOOK_NAME</td>
			<td>BOOK_RENTAL_PERIOD</td>
			<td>BOOK_STOCK</td>
		</tr>
		<c:forEach var="rental" items="${rentedBooks }">
			<tr>
				<td>${reservation.BOOK_ID }</td>
				<td>${reservation.BOOK_NAME }</td>
				<td>${reservation.BOOK_RENTAL_PERIOD }</td>
				<td>${reservation.BOOK_STOCK }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>