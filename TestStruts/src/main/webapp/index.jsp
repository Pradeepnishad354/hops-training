<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %> 
<html>
<head>
<%--
<style> 

 input[type=text], input[type=password] {
  width: 20%;
  padding: 12px 20px;
  margin: 7px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}


.container{
  padding: 16px;
 border:green;
  border-width:8px;
  border-style: inset;
  
 
}

#button{

 background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 10%;

}
#b{
background-color: #04AA6D; /* Green */
 
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
 margin: 8px 0;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;

}



</style>

 --%>
</head>

<div class="container">
<body bgcolor="green">
<s:form action="login" method="post">
<s:textfield id="a" label="Enter Name" name="name"></s:textfield>
<%-- <s:textfield label="Enter Password" name="password"></s:textfield> --%>
<s:password id="a"  label ="Enter Password" name="password"  ></s:password>
<s:submit id="button" value="Login"></s:submit>
<a id="register" href="register.jsp">RegisterNewUser</a>


</s:form>



<!-- <body>

 <div class="container">
 <form action="login" method="post">
      <label for="uname"><b>Username</b></label>
      <input type="text" placeholder="Enter Username" name="uname" required><br>

      <label for="psw"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="psw" required><br>
        
      <button id="button"type="submit">Login</button>
      <label>
        <input type="checkbox" checked="checked" name="remember"> Remember me
      </label>
      <a id="b"  href="register.jsp">RegisterHere</a>
      </form>
    </div>




 -->

</body>
</div>
<br> 
</html>