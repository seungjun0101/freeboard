<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>day10 로그인</title>
<style type="text/css">
div {
   width: 200px;
   height: 200px;
   background-color: #888;color:white;
   padding: 50px;
   margin: 100px auto;
}
input{    padding: 7px;
		margin: 15px auto; }
input[type=text],input[type=password]{
   border-radius: 4px; border: 2px solid #ccc;
}
input[type=submit], input[type=button] {
   padding: 7px 15px;
   margin: 7px 10px;
   background: #c69;
   color: white;
   border: none;
   cursor: pointer;
   width:35%;
}
</style>
 <link rel="stylesheet" href="./css/flexbox2.css?v=3"><!--현재 위치의 아래 css폴더  -->

</head>
<body>
<%@ include file = "top.jsp" %>
<section>
<div>
	<form action="loginAction.do" method = "post">
		<input type="text" name="userid" placeholder="아이디(이메일) 입력하세요.">
		<input type="password" name="password" placeholder="비밀번호 입력하세요">
		<input type="submit" value="Login">
		<input type="button" value="HOME" onclick="location.href='./'">
	</form>
</div>
</section>
<%@ include file = "bottom.jsp" %>

</body>
</html>























