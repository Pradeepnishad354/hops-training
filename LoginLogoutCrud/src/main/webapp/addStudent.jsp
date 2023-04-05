<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
 crossorigin="anonymous">
<style>
.container {
	width: 40%;
	border: 1px solid black;
	margin: auto;
	font-size: 30px;
	background-color: pink;
}
</style>

</head>
<body>
	<div class="container">
	
	 <c:if test="${student != null}">
                            <form action="update" method="post">
                        </c:if>
                        <c:if test="${student == null}">
                            <form action="student" method="post">
                        </c:if>

                        <caption>
                            <h2>
                                <c:if test="${student != null}">
                                  Update Student
                                </c:if>
                                <c:if test="${student == null}">
                                   Add student 
                                </c:if>
                            </h2>
                        </caption>

                        <c:if test="${student != null}">
                            <input type="hidden" name="id" value="<c:out value='${student.id}' />" />
                        </c:if>
	
	
	
	
	
	

			<h1>Add Student form</h1>

		<!-- 	 <form action="student"  method="post" >  -->

			id :<input type="number" placeholder="enter your id " name="id"  ><br> 
				
			name :<input type="text" name="name" value='<c:out value="${student.name}"></c:out>' ><br>
			email :<input type="email"name="email" value='<c:out value="${student.email}"></c:out>'><br> 
			city :<input type="text" name="city" value='<c:out value="${student.city}"></c:out>' ><br>
				


			<button type="submit">Save</button>
			<a href="student">View</a>
		



</form>

	</div>
</body>
</html>