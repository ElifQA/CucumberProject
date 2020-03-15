package com.hrms.JDBC.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Jdbcdemo2 {
	String dbUrl="jdbc:mysql://54.167.125.15/syntaxhrm_mysql";
	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";
	
	
	@Test
	public void getDataFromDataBase() throws SQLException {
		Connection connection=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		System.out.println("connection is created");
		
		Statement st=connection.createStatement();
		ResultSet rset=st.executeQuery("select*from ohrm_job_title");
		
		ArrayList<String > jobList=new ArrayList();
		while(rset.next()) {
			jobList.add(rset.getString("job_title"));
		}
		
		for(String data:jobList) {
			System.out.println(data);
		}
		
		rset.close();
		st.close();
		connection.close();
	}
	
	ArrayList<String> arrLst=new ArrayList();
}
