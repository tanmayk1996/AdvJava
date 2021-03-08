
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyForm1
 */
@WebServlet("/MyForm1")
public class MyForm1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		request = response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		out.print(" hello you have calle the server from client....");
		
		System.out.println("hello");
	
	}





MyForm1()
{
	System.out.println("this is constructor");
	
}
public void init()
{
	System.out.println("init is called");
}
public void destroy()
{
	
System.out.println("it is destroyed");
}
}
