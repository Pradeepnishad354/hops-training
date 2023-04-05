package com.project;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;


public class StudentServlet extends HttpServlet{
	
	private StudentDao studentDao;
	
	public void init() {
		
		studentDao =new StudentDao();
	}
	
	
	
	
	
	

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int  id = Integer.parseInt(request.getParameter("id"));
		
		
		
		String name = request.getParameter("name");
		
		String email = request.getParameter("email");
		String city= request.getParameter("city");
		
		studentDao.saveStudent(id, name, email, city);
		
		response.sendRedirect("addStudent.jsp");
		
		
		
		
		
		
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("<h1> id "+ id+"<h1>");
//		out.println(name);
//		out.println(email);
//		out.println(city);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Document> students = studentDao.getStudents();
		System.out.println("sLFMClmfKL"+students);
		request.setAttribute("students", students);
		RequestDispatcher dispatcher = request.getRequestDispatcher("student_list.jsp");
		dispatcher.forward(request, response);

	}

	


	}

