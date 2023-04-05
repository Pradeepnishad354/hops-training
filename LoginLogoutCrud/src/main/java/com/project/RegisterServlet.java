package com.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		String  name =  request.getParameter("name");
		String email = request.getParameter("email");
		String password=request.getParameter("password");
		
	
		Document document=new Document("name",name).append("email", email).append("password", password);
		
		
		
		MongoDatabase database = MongoConnection.getConnection();
		MongoCollection<Document> collection = database.getCollection("student");
		collection.insertOne(document);
		
	response.sendRedirect("welcome.jsp");
		
		
		
		
		
		out.println("<h1>name : "+name+"</h1>");
		
		out.println("<h1>Email : "+email+"</h1>");
		out.println("<h1>password : "+password+"</h1>");
		
		
	}
	
	
	

}
