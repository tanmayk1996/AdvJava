

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First
 */
@WebServlet("/First")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public First() {
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
	
		
		String uname = request.getParameter("username");
	
		
		//creating cookie
		Cookie cookie = new Cookie("myuserkey",uname);
		cookie.setMaxAge(120);
		response.addCookie(cookie);//it will add cookie in our response and it in browser.
		
		
		
		
		
		
		
		out.print("<h2>this is first page</h2> <br><br>");
		
		out.print("your name is "+uname+"<br><br>");
	
		out.print("<a href ='Second'>Clicl me to  go to second page");
	}

}
