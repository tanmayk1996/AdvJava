<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String name=request.getParameter("username");
	String password=request.getParameter("password");
	
	if(password.equals("admin"))
	{
		out.print("logged in successfully"+"<br>");
		out.print(name+"<br>");
	}
	else
	{

		out.print("incorrect password"+"<br>");
		RequestDispatcher re =request.getRequestDispatcher("login.jsp");
		re.include(request, response);
		
	}
	
%>
<a href="profile.jsp"></a>
</body>
</html>