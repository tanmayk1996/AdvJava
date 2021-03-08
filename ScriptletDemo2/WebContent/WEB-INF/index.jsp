<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!//outside the service method
	int a = 10;
	int b = 20;
	int c = 40;

	String checkAge(int age) {
		if (age >= 18)
			return "You can vote";
		else

			return "you cannot vote";

	}%>
	<%
	int x = 10;
	int y = 20;
	int res1 = a + b;
	int res2 = x + y;
	out.print(res1 + "<br><br>");

	out.print(res2 + "<br><br>");

	out.print("local" + c + "<br><br>");

	out.print("global" + this.c + "<br><br>");

	out.print("==========================<br><br>");

	out.print("method = " + checkAge(2));
	
	%>
<a href="Expressiontag.jsp"> Expression Demo</a>
	




</body>
</html>