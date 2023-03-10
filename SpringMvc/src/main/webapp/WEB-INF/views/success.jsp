<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- <h1>welcome ${userName}</h1>
<h1>your email is  ${userEmail}</h1>
<h1>password  ${userPassword}</h1> --%>

<h1>welcome ${user.name}</h1>
<h1>your email is  ${user.email}</h1>
<h1>password  ${user.password}</h1>

</body>
</html>