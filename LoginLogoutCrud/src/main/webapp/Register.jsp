<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
 crossorigin="anonymous">
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
<div class="container" >
<h1>Register Page</h1>
<form action="Register" method="post">

			<table>
				<tr>
					<td>Enter your name :</td>
					<td><input type="text" name="name"
						placeholder="enter name here " required /></td>
				</tr>
				<tr>
					<td>Enter your password :</td>
					<td><input type="password" name="password"
						placeholder="enter the password"  required /></td>

				</tr>
				<tr>
					<td>Enter your email :</td>
					<td><input type="email" name="email"
						placeholder="enter email here" required ></td>
				</tr>
				
				
</table>
<button type="submit">Register</button>
<button type="reset">Reset</button>
</form>
</div>
</body>
</html>