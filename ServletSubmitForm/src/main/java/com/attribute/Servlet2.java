package com.attribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends  HttpServlet
{

	
	
public void doPost(HttpServletRequest  request,HttpServletResponse response) throws IOException, ServletException {
		
		
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println();
		
	int n1 = Integer.parseInt(request.getParameter("n1"));
	
	int n2 = Integer.parseInt(request.getParameter("n2"));
	
	int p=n1*n2;
	
	// get attribute from request object 
	int sum = (int) request.getAttribute("sum");
	out.println("<h1>");
	out.println("Sum is "+sum);
	out.println("Product is "+p);
	
	out.println("<h1>");
	
}	
}
