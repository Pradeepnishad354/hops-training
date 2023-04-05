package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		

//		String name = req.getParameter("name");
//		
//		System.out.println(name);
//		
		
//		out.print("<h1>Welcome "+name+ "</h1>");
//		out.print("<h1>In Second Sevlet </h1>");
//		
		
		HttpSession session = req.getSession();
		
		String s = (String) session.getAttribute("n1");
		System.out.println(s);
		//resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		out.print("<h1>Second servlet "+s+" </h1>");
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);
	}
	
	
	
	
	
	
	
	

}
