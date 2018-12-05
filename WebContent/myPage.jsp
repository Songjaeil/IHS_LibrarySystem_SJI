<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="vo.Members"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%=session.getAttribute("ID")%> 내 정보</title>
</head>
<body>
	<table>
		<tr>
			<td><a>대여 기록</a>&nbsp;&nbsp;<a href="membermodify.lib">정보 변경</a>&nbsp;&nbsp;<a>글
					작성 기록</a></td>
		</tr>
	</table>
</body>
</html>