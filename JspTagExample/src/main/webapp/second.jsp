<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.Random"%>
<%-- <%@page isErrorPage="false" %>
    <%@page session="true" %>
    <%@page extends="" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
* {
	padding: 0px;
	margin: 0px;
}
</style>
</head>
<body>
	<h1>This is Jsp page</h1>
	<h1>

		<%
		Random r = new Random();

		int n = r.nextInt(10);
		%>

		<%@ include file="header.jsp"%>
	</h1>
	<h1>
		Random number :
		<%=n%></h1>

</body>
</html>