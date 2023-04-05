package com.project;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("email");

		String password = request.getParameter("password");

		// captcha 
		String c1 = request.getParameter("captcha");
		String c2 = request.getParameter("captcha1");
		
		
		// get the username and password from db
//		Document document=new Document("email",username).append("password",password);
//		
//		MongoDatabase database = MongoConnection.getConnection();
//		MongoCollection<Document> collection = database.getCollection("student");
//		Document result = collection.find(document).first();
//		
//
//		System.out.println("result ........"+result);
	
//	String storedPassword = result.getString("password");
//	
//	String storedUser = result.getString("email");
//	
//	if(username.equals(storedUser) && password.equals(storedPassword)) {
//		
//			response.sendRedirect("welcome.jsp");
//	}
//		
		
//		
//		if(result!=null) {
//			
//			response.sendRedirect("welcome.jsp");
//		}else {
//			
//			response.sendRedirect("login.jsp");
//		}
		
		if (username.equals("pradeep@gmail.com") && password.equals("123") && c1.equals(c2)) {

//			if (c1.equals(c2)) {
//
//				response.sendRedirect("welcome.jsp");
//			} else {
//
//				RequestDispatcher ds = request.getRequestDispatcher("login.jsp");
//				ds.include(request, response);
//				
//			}

			HttpSession session = request.getSession();

			session.setAttribute("username1", username);

			response.sendRedirect("welcome.jsp");

		} else {

			response.sendRedirect("login.jsp");
		}

	}


	}

