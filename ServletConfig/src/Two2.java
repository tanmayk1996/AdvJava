

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Two
 */

public class Two2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			

			out.print("this is two");
			
			ServletContext context = getServletContext();
			String mydatabase =context.getInitParameter("database");
			out.println("the database is "+mydatabase);
	
			ServletConfig config= getServletConfig();
			String message =config.getInitParameter("msg");
			out.print("message is"+message+"<br>");
		}	
	
	}


