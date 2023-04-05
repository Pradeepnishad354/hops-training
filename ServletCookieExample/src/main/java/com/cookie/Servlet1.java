package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		
		String name = request.getParameter("name");
		
		// Servletcontext
//		ServletContext context = getServletContext();
//		String str = context.getInitParameter("name1");
//		             String string = context.getInitParameter("phone");
//		
//		out.println("context object <br>"+str);
//		
//		out.println("context object "+string);

		//Servlet Config
		
//		ServletConfig config = getServletConfig();
//		String string2 = config.getInitParameter("name1");
//	    out.println("Servlet config "+string2 );
//		
		
		
		
		out.println("<h1> Hello "+name+" Welcome to my website"+"</h1>");
		out.println("<h1><a href='Servlet2'>Go to Servlet2 </a></h1>");
		
		// create cookie 
		
		
		Cookie c=new Cookie("user_name", name);
		
		response.addCookie(c);
		
		
		
		
		
	}

}
