<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<style>

	body{
	
		overflow: hidden;
		margin: 0;
		padding: 0;
		
	}

	.star{
	
		color:#FFEB3B;
		cursor: pointer;
		
	}
	
	.evaluation{
	
		text-align: center;
		
	}
	
	.road{
	
		position:absolute;
		bottom:0;
		background-color: black;
		width: 100%;
		height: 25px;
		
	}

	.man{
		
		position:absolute;
	
		margin-top: -32px;
		
		left: 0;
	
	}
	
</style>
</head>
<body>

<div style="background-color: black; position: absolute;z-index:5; width: 100%; height: 100%;">

	<i class='fa fa-magic fa-2x magic' style="position: absolute; top:50%; color: white; left: 1%; font-size: 25px; cursor: pointer;"></i>
	<span class='target' style="color: white; position: absolute; top: 10%; width: 100%; text-align: center; font-weight: bold; font-size: 25px;"></span>

</div>

<div class='evaluation'>

<i class='fa fa-star-o fa-3x star'></i>
<i class='fa fa-star-o fa-3x star'></i>
<i class='fa fa-star-o fa-3x star'></i>
<i class='fa fa-star-o fa-3x star'></i>
<i class='fa fa-star-o fa-3x star'></i><br/>

</div>



<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
<script>

setInterval(function(){
	
	$(".magic").animate({"font-size":"45px"},500,function(){
		
		$(this).animate({"font-size":"25px"},500);
		
	});
	
},1000)

$(".magic").click(function(){
	
	$(this).parent().animate({"border-radius":"5000px",width:0,height:0,top:"50%",left:"50%"},1000);
	
});

var many = 0;

setInterval(function(){
	var money_x = Math.floor((Math.random() * 100) + 1);
	
	$("body").prepend("<i class='fa fa-money money' style='position:absolute; top:0;left:"+String(money_x)+"%;'></i>")
	
	$(".money").eq(0).animate({top:"98%",opacity:0},3000,function(){
		
		$(this).remove();
		
	});
	
	$("#many").html(many++);
	
},100)


	$(".fa-star-o").mouseover(function(){
		
		$(".star").removeClass("fa-spin");
		$(this).addClass("fa-spin");
		$(".star").addClass("fa-star-o");
		$(".star").removeClass("fa-star");
		
		var target = $(this).index();
		
		for (var i = 0; i < target+1; i++) {
			
			$(".star").eq(i).addClass("fa-star");
			$(".star").eq(i).removeClass("fa-star-o");
				
		}
		
	}).mouseout(function(){
		
		$(".star").removeClass("fa-spin");
		
	}).click(function(){
		
		var eval = $(this).index()+1;
		
		$(".target").html(eval+"점 입니다,");
		
		$(".magic").parent().animate({"border-radius":"0",width:"100%",height:"100%",top:"0",left:"0"},1000);
		
	});

</script>
</body>
</html>