<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>capture field </title>
</head>
<body>

<%
String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

String lower="abcdefghijklmnopqrstuvwxyz";

String digit="0123456789";


String symbol=upper+lower+digit;
int m=symbol.length();
String captcha="";

Random r=new Random();
for(int i=0; i<5; i++){
	
	captcha=captcha+symbol.charAt(r.nextInt(m));
	
}



%>




</body>
</html>