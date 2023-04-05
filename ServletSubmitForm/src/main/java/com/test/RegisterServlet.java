package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<h1>Welcome to MY Register page<h1>");

		String name = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");
		String cond = request.getParameter("condition");
		
		System.out.println(cond);
		
		
		
		

		if (cond != null) {

			if (cond.equals("checked")) {
				out.println("<h2> Name : " + name + "<h2>");
				out.println("<h2> Password : " + password + "<h2>");
				out.println("<h2> Email : " + email + "<h2>");
				out.println("<h2> Gender : " + gender + "<h2>");
				out.println("<h2> Course : " + course + "<h2>");

				// forward request using RequestDispatcher Servlet
				
				RequestDispatcher rd=request.getRequestDispatcher("success");
				
				rd.forward(request, response);
				
				
			} else {
				
				out.println("<h2>you have not accept term and condition <h2>");
			}
		} else {
			out.println("<h2>you have not accept term and condition <h2>");
		
			// i want to include index.html file 
			
			// get the object of requestDispatcher
		 RequestDispatcher rd1=request.getRequestDispatcher("index.html");
		 
		 // include 
		 rd1.include(request, response);
		}
	}
}
