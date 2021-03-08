package com.fujitsu.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fujitsu.model.Student;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
	//System.out.println("Student Controller is runnig");
	
		int studentId= Integer.parseInt(request.getParameter("sid"));
		String studentName = request.getParameter("sname");
		
		System.out.println(" id:" +studentId+" name : "+studentName);
		
		Student model = new Student(id,Name); 
		
		//Database Operation//
		
		request.setAttribute("student", model);
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
		
		
		System.out.println(model);
		
		
	}

}
