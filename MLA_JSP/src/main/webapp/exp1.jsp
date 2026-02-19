<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>tags</title>
</head>
<body>
		<!-- Declaration Tag -->
		<%!
			int x=200;
		    int y=300;
		    public int add()
		    {
		    	return x+y;
		    }
		%>
		
		<!--  expression tag -->
		<%= add() %>
		<!--  scriplet tag -->
		<%
		     out.println("CURRENT DATE: "+new Date());
		
		%>
		
</body>
</html>