package com.attribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	
	public void doPost(HttpServletRequest  request,HttpServletResponse response) throws IOException, ServletException {
		
		
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println();
		
		String n1 = request.getParameter("n1");
		
		String n2 = request.getParameter("n2");
	
		//cast into integer
		
		int i1 = Integer.parseInt(n1);
		int i2 = Integer.parseInt(n2);
		
		//add
		
		int s=i1+i2;
		
		// attribute......
		
		request.setAttribute("sum",s);
		
		// requestDispatcher to forward requset
		
		RequestDispatcher rd = request.getRequestDispatcher("servlet2");
		
		rd.forward(request, response);
		
		
	
	}

}
