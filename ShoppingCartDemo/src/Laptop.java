

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Laptop
 */
@WebServlet("/Laptop")
public class Laptop extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		
		int price =Integer.parseInt(request.getParameter("price"));
		int quantity =Integer.parseInt(request.getParameter("quantity"));
		
		int totalprice = price*quantity;
		
		out.print("<h3> Price = "+price  +"</h3><br>");
		
		out.print("<h3> Quantity = "+quantity  +"</h3><br>");
		
		out.print("<h3> Total Price = "+totalprice  +"</h3><br>");
		
		out.print("the above is added to cart");
		
	Cookie cookie = new Cookie("laptop", String.valueOf(totalprice));
	response.addCookie(cookie);
		
		out.print("<a href='MyCart'>MyCart</a>");
		
	}
}


