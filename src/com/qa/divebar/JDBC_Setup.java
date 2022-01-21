package com.qa.divebar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Setup {
	final String JDBC_Driver = "com.mysql.cj.jdbc.Driver";
	final String db_url = "jdbc:mysql://localhost:3306/divebar";

	final String user = "root";
	final String password = "password here";

	Connection conn = null;

	public Connection connect() {
		try {
			Class.forName(JDBC_Driver);
			conn = DriverManager.getConnection(db_url, user, password);
			System.out.println("Connected to Database!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

}
