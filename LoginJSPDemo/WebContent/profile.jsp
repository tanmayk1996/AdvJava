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
if(session.getAttribute("name")!=null)
{

	String name=(String)session.getAttribute("name");
	out.print("welcome "+name+"to profile page");


}

else
{
	 request.getRequestDispatcher("login.jsp").forward(request, response);
	
}
%>
<a href ="logout.jsp">Click here to logout</a>
</body>
</html>