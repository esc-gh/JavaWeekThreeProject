package com.qa.divebar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Setup {
	final String JDBC_Driver = "com.mysql.cj.jdbc.Driver";
	final String db_url = "jdbc:mysql://localhost:3306/divebar";

	final String user = "root";
	final String password = "Cooper2354";

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

	// string name
	// boolean is alcoholic
	// float price
	// int id
	// string type

	public Drinks returnResults(ResultSet resultSet) {
		try {
			int id = resultSet.getInt("id");
			boolean isAlcoholic = resultSet.getBoolean("alcoholic");
			float price = resultSet.getFloat("price");
			String type = resultSet.getString("type");
			String name = resultSet.getString("name");

			Drinks drinks = new Drinks(id, name, isAlcoholic, price, type);
			return drinks;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
