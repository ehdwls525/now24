<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>well met!</title>
</head>
<body>

<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>

<h2><a href="/board/list">board</a></h2>

<button id="writeBtn">글쓰기</button>

<ul>
<c:forEach var="list" items="${list}">
	 <li>${list.board_no} <a href="/board/read?board_no=${list.board_no}">${list.board_title}</a> ${list.board_nickname}</li>
</c:forEach>
</ul>

<script>

	$("#writeBtn").on("click", function(){
		location.href="/board/write";
	});

</script>
</body>
</html>