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
		<c:forEach var="boardList" items="${boardList}">
			<li>${boardList.bno} | <a href="readBoard?bno=${boardList.bno}">${boardList.title}</a> | ${boardList.writer}</li>
		</c:forEach>
	</ul>
	<a href="formBoard">write</a>

</body>
</html>