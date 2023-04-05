<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>this is my first page</h1>

	<!-- // declarative tag  -->
	<%!int a = 4;
	int b = 6;

	int sum = a + b;

	public int doSum() {

		return a + b;
	}

	public String reverse() {

		StringBuffer br = new StringBuffer("pradeep");

		return br.reverse().toString();

	}%>
	<!-- //scriptlet tag -->
	<%
	out.print("the value of a is " + a);
	
	out.print("<br>");
	out.print("the sum of two number is " + sum);
	out.print("<br>");
	out.print(doSum());
	out.print(reverse());
	%>

<!-- expression tag  -->


<h1  style="color: green">the sum : <%=doSum()%></h1>
<h1><%=a %></h1>
<h1><%= reverse() %></h1>


</body>
</html>