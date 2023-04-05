<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
.container{
width:40%;
border:1px solid black;
margin:auto;
font-size:30px;

background-color: pink;

}


</style>

</head>
<body>
<div class="container">
<h1>Update Student form</h1>
 
<form action="update"  method="post" >
 
<c:forEach var="student" items="${student}">



id :<input type="number" placeholder="enter your id " name="id"  value='<c:out value="${student.id}"></c:out>'><br>

name :<input type="text" name="name"  value='<c:out value="${student.name}"></c:out>' ><br>
email :<input type="email" name="email"   value='<c:out value="${student.email}"></c:out>'><br>

city :<input type="text" name="city"  value='<c:out value="${student.city}"></c:out>' ><br>


<button type="submit">Save</button>
<a href="student">View</a>
</c:forEach>
</form>




</div>
</body>
</html> --%>