<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>새로운 도서를 입력합니다.</h1>
	<form name="insertbookform" action="./insertBook.lib" method="post">
		<table>
			<tr>
				<td>BOOK_ID</td>
				<td><input type="text" name="BOOK_ID" id="BOOK_ID" /></td>
			</tr>
			<tr>
				<td>BOOK_STOCK</td>
				<td><input type="text" name="BOOK_STOCK" id="BOOK_STOCK" /></td>
			</tr>
			<tr>
				<td>BOOK_NAME</td>
				<td><input type="text" name="BOOK_NAME" id="BOOK_NAME" /></td>
			</tr>
			<tr>
				<td>BOOK_PRICE</td>
				<td><input type="text" name="BOOK_PRICE" id="BOOK_PRICE" /></td>
			</tr>
			<tr>
				<td>BOOK_RENTALPRICE</td>
				<td><input type="text" name="BOOK_RENTALPRICE"
					id="BOOK_RENTALPRICE" /></td>
			</tr>
			<tr>
				<td>BOOK_AUTHOR</td>
				<td><input type="text" name="BOOK_AUTHOR" id="BOOK_AUTHOR" /></td>
			</tr>
			<tr>
				<td>BOOK_PUBLISHER</td>
				<td><input type="text" name="BOOK_PUBLISHER"
					id="BOOK_PUBLISHER" /></td>
			</tr>
		</table>
		<a href="javascript:insertbookform.submit()">등록</a> <a
			href="javascript:insertbookform.reset()">다시쓰기</a>
	</form>

</body>
</html>