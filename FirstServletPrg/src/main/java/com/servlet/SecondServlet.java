package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
	System.out.println("this is my second servlet using generic servlet ");
		
	res.setContentType("text/html");
	
	PrintWriter writer = res.getWriter();
	
	writer.println("<h1>this is my second servlet using generic servlet<h1>");
	
	
	}

}
