<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %> 
<body>
<s:form action="login" method="post">
<s:textfield label="Enter Name" name="name"></s:textfield>
<s:textfield label="Enter Password" name="password"></s:textfield>
<s:submit value="Login"></s:submit>
</s:form>
<br>

</body>