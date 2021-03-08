

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Second
 */
@WebServlet("/Second")
public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Second() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
	
		out.print("<h2>This is second page</h2><br><br>");
	
		HttpSession session = request.getSession(false);
		try
		{
		out.print("username is "+ session.getAttribute("username"));
		out.print("Password is "+session.getAttribute("password"));
		}
		catch(Exception e)
		{
			out.print("the session is expired");
		}
		out.print("<a href='Logout'>Logout</a>");
		//out.print(session.getCreationTime());
		//out.print(session.getLastAccessedTime());
	}
}