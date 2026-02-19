<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
		<h1>Login Page</h1>
		<form action="LoginServlet" method="post">
		Enter UserName: <input type="text" name="username">
		Enter password:<input type="password" name="password">
		<input type="submit" value="login">
		</form>
</body>
</html>