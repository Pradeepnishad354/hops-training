package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		// getting all the cookie

		Cookie[] cookies = request.getCookies();

		boolean f = false;
		String name="";
		
		if (cookies == null) {

			out.println("<h1> you have a new user go to home page and submit your name");
			return;

		} else {

			for (Cookie c : cookies) {

				String tname = c.getName();

				if (tname.equals("user_name")) {

					f = true;

					 name = c.getValue();
				}
			}
		}

		
		if (f) {

			out.println("<h1> Hello  " + name + " Welcome back my website" + "</h1>");
			out.print("<h1>Thank You</h1>");
		} else {
			out.println("<h1> you have a new user go to home page and submit your name");
		}

	}
}
