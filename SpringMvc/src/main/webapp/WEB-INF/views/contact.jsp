<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>    
<!doctype html>
<html lang="en">
  <head>
  
  
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
  
  <div class="container mt-5">
  <div class="container text-center">
  <h1>Registration Form ${Header} </h1>
      <p class="text-center">${Desc }</p>
  </div>
  <form action="processForm" method="post">
    <div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Email address</label>
  <input type="email" class="form-control" name="email" id="exampleFormControlInput1" placeholder="enter email">
</div>
<div class="mb-3">
  <label for="userName" class="form-label">UserName</label>
  <input type="text" class="form-control"  name="name" id="userName" placeholder="enter name here ">
</div>

<div class="mb-3">
  <label for="password" class="form-label">Password</label>
  <input type="password" class="form-control"  name="password" id="password" placeholder="enter password">
</div>

<div class="container text-center"><button type="submit" class="btn btn-success">Signup</button>
</div>
</form>
</div>
  </body>
</html>