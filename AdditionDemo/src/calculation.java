

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calculation
 */
@WebServlet("/calculation")
public class calculation extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));
		//String number1= request.getParameter("num1");
	//	String number2= request.getParameter("num2");
		
		String calculation = request.getParameter("calc");
		System.out.println("you have clicked"+calculation +"button");
		
		
		int result=0;
		if(calculation.equalsIgnoreCase("add"));
		{
			result = n1+n2;
			out.print("result of add"+result);
		}
		
		 if(calculation.equalsIgnoreCase("sub"));
		{
			result = n1-n2;
			out.print("result of sub"+result);
		}
		
			if(calculation.equalsIgnoreCase("mul"));
		{
			result = n1*n2;
			out.print("result of mul"+result);
		}
		
		if(calculation.equalsIgnoreCase("div"));
		{
			result = n1/n2;
			out.print("result of div"+result);
		}
		
	/*	int num = Integer.parseInt(request.getParameter(num1))
		 
		int add=n1+n2;
		out.print("Add = "+add);
	
		int sub = n1-n2;
		out.print("Sub ="+sub);
		

		int mul = n1*n2;
		out.print("Sub ="+sub);
		

		int div = n1/n2;
		out.print("Div ="+div);*/
	}

}
