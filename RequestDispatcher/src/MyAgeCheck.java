

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyAgeCheck
 */
@WebServlet("/MyAgeCheck")
public class MyAgeCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());

		
		
	//	response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
	int userage = Integer.parseInt(request.getParameter("age"));
	
	if(userage>=18)
	{
	//RequestDispatcher	rd= request.getRequestDispatcher("Welcome.html");
		//rd.forward(request, response);
		response.sendRedirect("https://www.google.com/");
	}
	else
	{
		out.print("you are not eligible age should be greater than 17");
		RequestDispatcher	rd= request.getRequestDispatcher("index.html");
			rd.include(request, response);
			
	}

}
}
