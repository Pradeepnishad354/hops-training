<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>this is home page</h1>
	<h1>called by home controller</h1>
	<h1>url /home</h1>

	<%
	String name = (String) request.getAttribute("name");
	%>

	<%
	Integer i = (Integer) request.getAttribute("id");

	List<String> friend = (List<String>) request.getAttribute("f");
	%>

	<h1>
		my name is
		<%=name%>
	</h1>
	<h1>
		Id is
		<%=i%></h1>

	<%
	for (String s : friend) {
	%>
	<h1><%=s%></h1>

	<%
	}
	%>

</body>
</html>