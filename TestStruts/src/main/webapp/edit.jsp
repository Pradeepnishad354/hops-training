<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
    <%@taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<s:form action="updates">

<s:textfield label="id" value="%{#application.a}" name="s.id" readonly="true" />
<s:textfield label="Enter your name" value="%{#application.b}" name="s.name" />
<s:textfield label="Enter your age" value="%{#application.c}" name="s.age" />
<s:textfield label="Enter Your Email" value="%{#application.d}" name="s.email" />
<s:textfield label="Enter Your City" value="%{#application.e}" name="s.city" />
<s:submit value="Update" />

</s:form>


</body>
</html>