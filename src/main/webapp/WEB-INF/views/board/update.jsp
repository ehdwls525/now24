<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>update</title>
</head>
<body>

<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>

<h2><a href="/board/list">board</a></h2>

<form name="updateForm" id="updateForm" action="/board/update" method="post">
	<input type="hidden" name="board_no" value="${read.board_no}">
	<input type="text" name="board_title" value="${read.board_title}"><p>
	<input type="text" name="board_nickname" value="${read.board_nickname}" disabled><p>
	<textarea rows="20" cols="50" name="board_content">${read.board_content}</textarea><p>
	<button>수정하기</button>
</form>

</body>
</html>