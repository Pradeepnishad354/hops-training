<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
 crossorigin="anonymous">
<style>
.container{
width:80%;
border:1px solid black;
margin:auto;
font-size:30px;

background-color: pink;
}




</style>
</head>
<body>
<div class="container">


	<h1>List of User</h1>
 <a href="contact" >AddUser</a>
	<table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>ID &nbsp;&nbsp; &nbsp;&nbsp; </th>
                                <th>Name  </th>
                                <th>Email&nbsp;&nbsp;&nbsp;&nbsp; </th>
                                <th>City &nbsp;&nbsp;</th>
                                <th>Actions &nbsp;&nbsp;</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!--   for (Todo todo: todos) {  -->
                            <c:forEach var="u" items="${user}">

                                <tr>
                                    <td>
                                        <c:out value="${u.id}" ></c:out>
                                    </td>
                                    <td>
                                        <c:out value="${u.name}" />
                                    </td>
                                    <td>
                                        <c:out value="${u.email}" ></c:out>
                                    </td>
                                    <td>
                                        <c:out value="${u.city}" />
                                    </td>
                                    
                                  <%--   <td><a href="update?id=<c:out value='${students.id}'/>">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; 
                                    <a href="delete?id=<c:out value='${students.id}'/>">Delete</a></td>
                                </tr> --%>
                                
                               
                                
                            </c:forEach>
                            
                        </tbody>

                    </table>
</div>
</body>
</html>