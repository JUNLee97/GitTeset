<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<table border=1>
			<tr>
			    <td><b>num</b>
				<td><b>name</b>
				<td><b>message</b>
			</tr>
			<c:forEach var="list" items="${list }">

				<tr>
				    <td>${list.seq }
					<td>${list.name }
					<td>${list.message }
				</tr>
			</c:forEach>

		</table>
</body>
</html>