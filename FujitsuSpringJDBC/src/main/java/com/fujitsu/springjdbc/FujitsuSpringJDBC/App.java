package com.fujitsu.springjdbc.FujitsuSpringJDBC;
import java.util.*;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//SPRING JDBC//


public class App 
{
    public static void main( String[] args )
    {
    	// Step 1 :connect with your databse
    // url, username,password ,database
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://localhost:3306/employee");
    dataSource.setUsername("root");
    dataSource.setPassword("Anonymus@1996");
    
    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
    //insert
//    String sql ="insert into details (id,name,salary) value(?,?,?)";
//    int result = jdbcTemplate.update(sql,102,"samu",1234);
    
    /* UPDATE*/
  //    String sql ="update details set name =? where id=?";
 //     int result = jdbcTemplate.update(sql,"famu",102);
  
    
    /*DELETE*/
   // String sql ="delete from details where id=?";
   // int result = jdbcTemplate.update(sql,101);

    
    /*RETRIVE*/
    
   //  1. RowMapper-->resultSet
  //  2. loopthrough all the records from resultset
  //   3. put all the records into arrylist.
    String sql ="select * from details";
    
    RowMapper rowMap = new RowMapper() {
		
		public int[] getRowsForPaths(TreePath[] path) {
			// TODO Auto-generated method stub
			return null;
		
	
    public Details mapRow(ResultSet rs , int rowNum) throws SQLException{
	
	Integer id =rs.getint("id");
	String name=rs.getString("name");
	Integer salary=rs.getint("salary");
	
	return new Details(id,name,salary);
	}
};
List<Details> details= JdbcTemplate.query(sql,rowMap);

for(Details det : details)
	System.out.println(det);

   
		
		
   // if(result >0)
   // {
   // 	System.out.println("Database Deletion Successful");
   // }
  //  else
  //  {
 //   	System.out.println("Databse Deletion failed");
//    }
    
    }
}
