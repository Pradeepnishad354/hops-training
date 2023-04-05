package com.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

private StudentDao studentDao;
	
	public void init() {
		
		studentDao =new StudentDao();
	}
	
//	 public void showNewForm(HttpServletRequest request, HttpServletResponse response)
//			    throws ServletException, IOException {
//			        RequestDispatcher dispatcher = request.getRequestDispatcher("addStudent.jsp");
//			        dispatcher.forward(request, response);
//			    }
	
public  void doGet(HttpServletRequest  request,HttpServletResponse response) throws ServletException, IOException {
		
		int  id = Integer.parseInt(request.getParameter("id"));
		Document existingStudent = studentDao.getStudent(id);
		System.out.println("jwfowjfowjfwojf"+existingStudent);
		RequestDispatcher dispatcher = request.getRequestDispatcher("addStudent.jsp");
		request.setAttribute("student", existingStudent);
		dispatcher.forward(request, response);
		
		
		
	}

	//update student
@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	int  id = Integer.parseInt(request.getParameter("id"));
	
	String name = request.getParameter("name");
	
	String email = request.getParameter("email");
	String city= request.getParameter("city");
	
Student student=new Student(id, name, email, city);
studentDao.updateStudent(id, name, email, city);
	
	response.sendRedirect("student");
	
	}
	
	
	
	
	  
	}
