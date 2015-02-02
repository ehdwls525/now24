<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>read</title>
</head>
<body>

<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>

<h2><a href="/board/list">board</a></h2>

${read.board_no} ${read.board_title}<p>
${read.board_nickname}<p>
${read.board_content}

<form name="form1" id="form1" action="/board/update" method="get">
	<input type="hidden" name="board_no" value="${read.board_no}">
	<button>글수정</button>
</form>

<button id="deleteBtn">글삭제</button>

<button id="listBtn">목록으로</button>

<script>

	$("#deleteBtn").on("click", function(){
		document.form1.action="/board/delete";
		document.form1.method="post";
		document.form1.submit();
	});
	
	$("#listBtn").on("click", function(){
		document.form1.action="/board/list";
		document.form1.submit();
	});

</script>
</body>
</html>