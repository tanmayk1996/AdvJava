

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	

		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
	
		String name= request.getParameter("username");
		String password= request.getParameter("password");
		
		out.print("name is "+name+"<br><br>");
		out.print("password is "+password+"<br><br>");
		
		
		try
		{
			
			//step-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step2
			Connection con = DriverManager.getConnection(DbProperties.URL,DbProperties.User,DbProperties.DBPASSWORD);
			
			//step-3
			out.print("connected");
			
			
			PreparedStatement ps =con.prepareStatement("select * from userdetails where username=? and password=?");
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs =ps.executeQuery();
			
			
		int temp=0;
		while(rs.next())
		{
			temp=1;
		}
		
		if(temp==0)
		{
			out.print(" you have not register....please register ");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
		
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("welcome.html");
			rd.forward(request, response);
			
		
		}
		
		}
		catch(Exception e)
		{
			
		}
	}

	
	}


