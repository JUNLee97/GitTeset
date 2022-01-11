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
	<form action="insertMessage">
		<table border=1 style="margin: auto;">
			<tr>
				<td colspan=2><input type=text placeholder="input your name"
					id="name" name="name">
			</tr>
			<tr>
				<td colspan=2><input type=text placeholder="input message"
					id="message" name="message">
			</tr>
			<tr>
				<td><button id="insert">메세지 입려크</button></td>
				<td><button type="button" id="list">메세지 목록 출력력력력력</button></td>
			</tr>
		</table>
	</form>

	<c:if test="${result eq '1' }">
		<script>
			alert("성공적으로 작성되었습니다.");
			location.href = "redirect:/";
		</script>
	</c:if>
	
	<script>
	  $("#list").on("click",function() {
		  alert("성공적으로 리스트를 클릭했습니다.")
		  location.href ="list";
	  })
	
	
	</script>



</body>
</html>