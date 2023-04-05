<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login here</title>

<style>
.c{
width:40%;
border:1px solid black;
margin:auto;
font-size:30px;

background-color: pink;

}



</style>

</head>
<body>
<div class="c">
<h1>Login page</h1>

<form action="login" method="post">
<table>
<tr>
<td>UserName :</td>
<td><input type="text" name="email" placeholder="enter the username" required="required"></td>
</tr>
<tr>
<td>Password :</td>
<td><input type="password" placeholder="enter the password" name="password" ></td>
</tr>
<%@include file="captcha.jsp" %>

<tr>
<td>
<input style="color:red; font-size: 35 px; " name="captcha" value=<%=captcha %> readonly="readonly"></td></tr>
<tr>
<td><input type="text" name="captcha1" placeholder="enter captcha"></td>

</tr>

<!-- <tr>
<td>Enter captcha : </td>
<td><input type="text" name="captcha"></td>


</tr> -->

</table>
<button type="submit">Login</button>



</form>

</div>
</body>
</html>