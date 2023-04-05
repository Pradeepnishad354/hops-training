package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request ,HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		writer.println("this is success  servlet");
		writer.print("<h1> Successfully registered </h1>");
		
		
	}

}
