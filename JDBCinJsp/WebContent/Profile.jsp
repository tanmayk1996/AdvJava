<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Displaying Student Profile!</h2><br><br>


jdbc:mysql:// server-name : server-port / database-name Note – NOTE: Default server port is 3306


<%
	String url =" jdbc:mysql://localhost:3306/student";
	String user="root";
	String password="Anonymus@1996";

	//String sql = "select * from student where id =101";
	String sql = "insert into studentdetails values( 'map' ,108)";
	
/* Step 1 : Loading Driver Class*/ 
	Class.forName("com.mysql.jdbc.Driver");

	/* Step 2 : connection to DataBase*/ 
	Connection con = DriverManager.getConnection(url, user, password);

	/* Step 3 : Creating Statement*/ 
	Statement stmt = con.createStatement();
	
	/* Step 4 : Execute Query*/ 
//	ResultSet rs = stmt.executeQuery(sql);
//		rs.next();
	stmt.executeUpdate(sql);

%>


<%
		stmt.close();
		con.close();

%>

</body>
</html>