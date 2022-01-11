<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
</head>
<body>

 <table border=1 style="margin: auto;">

		<tr>
			<td colspan=2><input type=text placeholder="input your name"
				id="name">
		</tr>

		<tr>
			<td colspan=2><input type=text placeholder="input message"
				id="message">
		</tr>

		<tr>
			<td><button id="insert">메세지 입력</button></td>
			<td><button id="list">메세지 목록 출력</button></td>
		</tr>


	</table>

</body>
</html>