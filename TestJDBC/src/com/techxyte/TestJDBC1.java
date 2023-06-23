package com.techxyte;


import java.sql.*;
import oracle.jdbc.driver.*;
public class TestJDBC1 {
    public static void main (String args[]) throws Exception {
      // Load the Oracle JDBC driver
    	Class.forName("oracle.jdbc.OracleDriver");
      // connect through driver
     Connection conn = DriverManager.getConnection
             ("jdbc:oracle:thin:@192.168.0.114:1521:XE","system","admin");
 
     // Create Oracle DatabaseMetaData object
      DatabaseMetaData meta = conn.getMetaData();
 
      // gets driver info:
      System.out.println("JDBC driver version is " + meta.getDriverVersion());
 
      // Create a statement
      Statement stmt = conn.createStatement();
 
      // Do the SQL "Hello World" thing
      ResultSet rset = stmt.executeQuery("SELECT TABLE_NAME FROM USER_TABLES");
 
      while (rset.next())
         System.out.println(rset.getString(1));
 
      // close the result set, the statement and disconnect
      rset.close();
      stmt.close();
      conn.close();
     System.out.println("Your JDBC installation is correct.");
 }
}

