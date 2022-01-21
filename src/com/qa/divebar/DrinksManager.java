package com.qa.divebar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DrinksManager {

	static Statement stmt;
	static Connection conn;
	JDBC_Setup jdbc = new JDBC_Setup();

	public void connStmt(String query) {
		try {
			conn = jdbc.connect();
			stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			while (result.next()) {
				System.out.println(jdbc.returnResults(result));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
