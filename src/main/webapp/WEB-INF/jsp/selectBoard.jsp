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
			<li>${boardList.bno}</li>
			<li>${boardList.contents}</li>
		</c:forEach>
	</ul>
	<form method="post" action="insertBoard">
		contents = <input type="textarea" name="contents"> <input type="submit">
	</form>

</body>
</html>