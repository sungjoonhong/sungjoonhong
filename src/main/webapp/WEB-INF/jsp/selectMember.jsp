<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<c:forEach var="memberList" items="${memberList}">
			<li>${memberList.id}</li>
			<li>${memberList.name}</li>
		</c:forEach>
	</ul>
	<form method="post" action="insertMember">
		name = <input type="text" name="name"> <input type="submit">
	</form>

</body>
</html>