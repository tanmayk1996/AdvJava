package com.fujitsu.customTag;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class ResultHandler extends TagSupport{

	Connection conn;
	PreparedStatement stmt;
	
	
	public ResultHandler()
	{
		
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
	
	
		conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Anonymus@1996");

		stmt = conn.prepareStatement("select * from userdetails where name = ?");
	
	}
	catch(ClassNotFoundException | SQLException e)
	{
		e.printStackTrace();
	}

	}
	
	@Override
	public int doStartTag() throws JspException {
	
		ServletRequest request = pageContext.getRequest();
		String name = request.getParameter("username");
		
		try {
			stmt.setString(1, name);
			ResultSet rs = stmt.executeQuery();
			JspWriter out = pageContext.getOut();
			
			if(rs.next())
			{
			System.out.println("id :"+rs.getString(1));
			System.out.println("name: "+rs.getString(2));
			
			}
			else
			{
				out.print("User not found");
			}
			
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Tag.SKIP_BODY;
		//return super.doStartTag();
	}
	@Override
	public void release()
	{
		try {
			stmt.close();
			conn.close();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}{
	super.release();
}
}
