

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Register() {
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
	
		String name= request.getParameter("username");
		String password= request.getParameter("password");
		String gender= request.getParameter("gender");
		String address= request.getParameter("address");
		
		out.print("name is "+name+"<br><br>");
		out.print("password is "+password+"<br><br>");
		out.print("gender is "+gender+"<br><br>");
		out.print("address is "+address+"<br><br>");
		
		try
		{
			
			//step-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step2
			Connection con = DriverManager.getConnection(DbProperties.URL,DbProperties.User,DbProperties.DBPASSWORD);
			
			//step-3
			out.print("connected");
			
			
			PreparedStatement ps =con.prepareStatement("insert into userdetails values(?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, gender);
			ps.setString(4, address);
			
		int result = ps.executeUpdate();
		out.print(result);
		
		if(result>0)
		{
			out.print("registered successfully");
		}
		else
		{
			out.print("some thing went wrong ");
		}
		
		}
		catch(Exception e)
		{
			
		}
	}

}
