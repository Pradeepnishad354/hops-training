<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>    

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help</title>
</head>
<body>

<h1>This  is help page</h1>

<h1>
<%-- <% String name=(String)request.getAttribute("name"); %>
<% Integer roll=(Integer)request.getAttribute("rollnum"); %>
<% LocalDateTime date=( LocalDateTime)request.getAttribute("date"); %> --%>

</h1>
<%-- <h1>My name is<%= name %></h1>
<h1>My roll number <%= roll  %></h1>
<h1>local  <%= date  %></h1> --%>


<h1>${name}</h1>
<h1>${rollnum}</h1>
<%-- <h1>${number}</h1>
 --%>
<c:forEach var="a" items="${number}">
<h1><c:out value="${a}"></c:out></h1>
</c:forEach>
</body>
</html>