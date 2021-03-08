

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Details
 */
@WebServlet("/Details")
public class Details extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Details() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();


		String firstname = request.getParameter("firstname");
		String middlename = request.getParameter("middlename");
		String lastname = request.getParameter("lastname<br>");
		String gender = request.getParameter("gender<br>");
		String age = request.getParameter("age<br>");
		String hobbies[] = request.getParameterValues("hobby");
		
		pw.print(" first name is "+firstname+"<br><br>");
		pw.print("middle name is  "+middlename+"<br><br>");
		pw.print("last name is "+lastname+"<br><br>");
		pw.print("gender is "+gender+"<br><br>");
		pw.print("Age is "+age+"<br><br>");
		
		for(String values : hobbies)
		{
			pw.print(values +"<br>");
		}
	
		String password = request.getParameter("password");
		
		try
		{
			
			//step-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step2
			Connection con = DriverManager.getConnection(DbProperties.URL,DbProperties.User,DbProperties.DBPASSWORD);
			
			//step-3
			out.print("connected");
		}
		catch(Exception e)
		{
			
		}
	}

}
