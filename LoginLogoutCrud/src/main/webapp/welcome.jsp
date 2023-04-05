<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
 crossorigin="anonymous">
<style>
.a{

width:40%;
border:1px solid black;
margin:auto;
font-size:30px;

background-color: pink;

}


}


</style>

</head>
<body>
<div class="a">
<h1> Welcome ${username1} </h1>
<% 
if(session.getAttribute("username1")==null){
	
	
	response.sendRedirect("login.jsp");
	
	

}


%>
<form action="logout">




<button type="submit">Logout</button>

</form>
 
<a href="addStudent.jsp" >AddStudent</a>
<!-- <a  href="student" >Add Student</a> -->
</div>
</body>
</html>