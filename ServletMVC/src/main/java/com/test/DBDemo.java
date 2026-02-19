package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBDemo {
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/mla";
		String user="root";
		String pas="root@39";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pas);
		Statement stmt=con.createStatement();
		String sql="create table user101(fullname varchar(50),username varchar(50),password varchar(50))";
		stmt.execute(sql);
		con.close();
		System.out.println("Done.");
	}
}
