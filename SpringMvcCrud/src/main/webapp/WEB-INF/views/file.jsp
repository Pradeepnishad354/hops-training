<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>File Upload</h1>

<form action="processProfile" method="post" enctype="multipart/form-data">
  <input type="file"  name="profile">
  <button type="submit">Upload</button>
</form>
</body>
</html>