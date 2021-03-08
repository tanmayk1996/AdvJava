<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>

<%@ taglib prefix ="xyz"  uri="//com.jsp.servlet"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<xyz:displayStudent />  






Welcome to home page!!
<br>
<%
	int num1 =10;
	int num2 =0;
	int k =num1/num2;
	 	
/*	try
	{
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
		out.print("Exception handled in try catch");
	}

	*/
%>
<br>
<%= " Result = "+k %>
</body>
</html>