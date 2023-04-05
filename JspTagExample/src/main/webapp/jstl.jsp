<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page errorPage="error_page.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Taglib directive tutorial</h1>
<c:set var="name" value="pradeep"></c:set>
<h1><c:out value="${name}"></c:out></h1>

<c:if test="${3>2}">
<h1>this is true </h1>

</c:if>

<%-- <%! 
int a=40;
int b=0;
int s=a/b;
%>
<h1><%=
s

%></h1>
 --%>
</body>
</html>