package com.url;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		// url fetch 
		
//  String name = request.getParameter("user");
		//hidden field  
		String name = request.getParameter("name");
		out.print("<h1 style='color:green'>This is second servlet<h1> ");
		out.print("<h1 style='color:red;'>welcome back  : "+name+"</h1>");
		
		
		
		
		
		
		
	}
	
	

}
