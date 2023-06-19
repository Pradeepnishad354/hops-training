
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %> 
<body bgcolor="pink">
<s:form action="register" method="post">
<s:textfield label="Enter Name" name="name"></s:textfield>
<s:textfield label="Enter Password" name="password"></s:textfield>

<s:textfield label="Enter Email" name="email"></s:textfield>

<s:submit value="Register"></s:submit>
</s:form>