package com.url;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");

		out.println("<h1> your name is : " + name + "<h1>");
		
		// example of url rewriting
		//out.println("<a href='Servlet2?user=" + name + "' >Go to Second Servlet</a>");
		
		
		
		//hidden form field
		
		out.println(""+"<form action='Servlet2'>"+
		"<input type='hidden' name='name'  value='"+name+"'/>"
				
			+"<button type='submit'>Go to Second Servlet</button>"	
			+"</form>"	
				
				);
		
	}

}
