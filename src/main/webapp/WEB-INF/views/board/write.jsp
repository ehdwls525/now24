<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>write</title>
</head>
<body>

<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>

<h2><a href="/board/list">board</a></h2>

<form name="writeForm" id="writeForm" action="/board/write" method="post">
	<input type="text" name="board_title"><p>
	<input type="text" name="board_nickname"><p>
	<textarea rows="20" cols="50" name="board_content"></textarea><p>
	<button>글작성</button>
</form>

<button id="listBtn">목록으로</button>

<script>

	$("#listBtn").on("click", function(){
		location.href="/board/list";
	});

</script>
</body>
</html>