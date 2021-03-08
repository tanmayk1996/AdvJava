

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyCart
 */
@WebServlet("/MyCart")
public class MyCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		
		
		
		
	//	int totalValue =Integer.parseInt(request.getParameter("totalprice1"));
		//int totalValue =Integer.parseInt(request.getParameter("totalprice2"));
		//int totalValue =Integer.parseInt(request.getParameter("totalprice3"));
		
		
		
		
//int totalValue = totalprice1+totalprice2+totalprice3;
	//	
		//out.print("<h3> Price = "+Price  +"</h3><br>");
		
	//	out.print("<h3> Quantity = "+Price  +"</h3><br>");
	//	
	//	out.print("<h3> Quantity = "+Price  +"</h3><br>");
		
		//out.print("<h3> Total Value = "+totalValue  +"</h3><br>");
		
		
		
		
		
		
		
		
		
		Cookie cookie[]=request.getCookies();
		
		out.print("<table>");
	for(int i=0;i<cookie.length;i++)
	{
		out.print("<tr>");
		out.print("<td>"+cookie[i].getName()+"</td><td>"+cookie[i].getValue()+"</td>");
		out.print("<tr>");
		
	}
	out.print("</table>");
	}

}
