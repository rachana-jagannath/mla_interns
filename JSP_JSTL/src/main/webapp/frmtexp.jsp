<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
    <%@ taglib uri="jakarta.tags.fmt" prefix="fmt" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<c:set var="cdate" value="<%= new Date() %>"></c:set>
		<c:out value="${date}"></c:out>
		<h1>Date Time format</h1>
		<h3>
			Time: <fmt:formatDate type="time" value="${cdate}"/>
		</h3>
		<h3>
			Date: <fmt:formatDate type="date" value="${cdate}"/>
			
		</h3>
		<h3>
			Date & Time Short: <fmt:formatDate type="both" dateStyle="short" value="${cdate}"/>
		</h3>
		<h3>
			Date & Time Medium: <fmt:formatDate type="both" dateStyle="medium" value="${cdate}"/>
		</h3>
		<h3>
			Date & Time Long: <fmt:formatDate type="both" dateStyle="long" value="${cdate}"/>
		</h3>
		<h3>
			Date & Time Pattern: <fmt:formatDate pattern="yyyy-MM-dd" type="both" value="${cdate}"/>
		</h3>
</body>
</html>