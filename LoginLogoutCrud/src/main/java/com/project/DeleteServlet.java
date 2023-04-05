package com.project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet{

	
	
private StudentDao studentDao;
	
	public void init() {
		
		studentDao =new StudentDao();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
   int id = Integer.parseInt(request.getParameter("id"));
		
		studentDao.deleteStudent(id);
		response.sendRedirect("student");
		
		
		
		
		
		
	}
	
	
	

}
