package com.qa.divebar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Setup {
	final String JDBC_Driver = "com.mysql.cj.jdbc.Driver";
	final String db_url = "jdbc:mysql://localhost:3306/divebar";
	final String user = "root";
	final String password = "ajhsgdukshygfkujhadg";

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


	public Drink returnResults(ResultSet resultSet) {
		try {
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			boolean alcholic = resultSet.getBoolean("alcholic");
			float price = resultSet.getFloat("price");
			String type = resultSet.getString("type");
			Drink drink = new Drink(id, name, alcholic, price, type);
			return drink;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
