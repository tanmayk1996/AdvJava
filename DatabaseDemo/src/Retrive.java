

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Retrive
 */
@WebServlet("/Retrive")
public class Retrive extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
	
	
	
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
	
	
	
		try
		{
			
			//step-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step2
			Connection con = DriverManager.getConnection(DbProperties.URL,DbProperties.User,DbProperties.DBPASSWORD);
			
			//step-3
			out.print("connected");
			
			
			PreparedStatement ps =con.prepareStatement("select * from userdetails");
			ResultSet rs =ps.executeQuery();
			
			out.print("<table>");
		
		while(rs.next())
			
		{
			out.print("<tr>");
			out.print("<td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td>");
			out.print("</tr>");
		}
		
		
		
		}
		catch(Exception e)
		{
			
		}
	}
	
	
	}


