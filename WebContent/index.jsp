<%@page import="org.apache.struts2.dispatcher.SessionMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head> 
<meta charset="UTF-8" />
<title>Login : FX LMS App</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />

<%
	
%>
</head>
<body>

	<form action="login" method="post">
		<h1>Sign In</h1>
		<div class="inset">
			<p>
				<label for="email">EMAIL ADDRESS</label> <input type="text"
					name="username" id="email" >
			</p>
			<p>
				<label for="password">PASSWORD</label> <input type="password"
					name="password" id="password">
			</p>
			<p>
				<input type="checkbox" name="remember" id="remember"> <label
					for="remember">Remember</label>
			</p>
		</div>
		<p class="p-container">
			<span>Forgot password ?</span> <input type="submit" name="go" id="go"
				value="Log in">
		</p>
	</form>


</body>
</html>