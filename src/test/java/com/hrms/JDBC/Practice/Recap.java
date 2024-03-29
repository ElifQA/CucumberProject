package com.hrms.JDBC.Practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Recap {
	String dburl="jdbc:mysql://54.167.125.15/syntaxhrm_mysql";
	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";
	//String  id;
	//String skill;
	@Test
	public void gettingConnected() throws SQLException {
		Connection con= DriverManager.getConnection(dburl, dbUsername, dbPassword);
		
		DatabaseMetaData dbMetaData = con.getMetaData();
		String dbName = dbMetaData.getDatabaseProductName();
		System.out.println(dbName);
		Statement st = con.createStatement();
		ResultSet rset = st.executeQuery("select * from ohrm_skill");
		
		ResultSetMetaData rsetMetaData = rset.getMetaData();
		int cols = rsetMetaData.getColumnCount();
		System.out.println(cols);
		String colName;
		for (int i = 1; i <= cols; i++) {
			colName = rsetMetaData.getColumnClassName(i);
			System.out.println("Column Name =" + colName);
		}
		
		
		String  id;
		String skill;

		while(rset.next()) {
			id=rset.getObject("id").toString();
			skill=rset.getObject("name").toString();
		
			System.out.println(id+" = "+skill);
		}	
		rset.close();
		st.close();
		con.close();
	}

}
