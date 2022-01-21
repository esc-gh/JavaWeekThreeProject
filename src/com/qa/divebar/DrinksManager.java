package com.qa.divebar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

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

	public void addDrink(Drink drink) {
		try {
			conn = jdbc.connect();
			PreparedStatement preStmt = conn
					.prepareStatement("INSERT INTO pizzas (name, alcoholic, price, type) VALUES(?, ?, ?, ?)");
			preStmt.setString(1, drink.getName());
			preStmt.setBoolean(2, drink.isAlcoholic());
			preStmt.setFloat(3, drink.getPrice());
			preStmt.setString(4, drink.getType());
			preStmt.executeUpdate();
			System.out.println(drink.getName() + " added to database");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void addDrinkMulti(List<Drink> drink) {
		for (int i = 0; i < drink.size(); i++) {
			try {
				conn = jdbc.connect();
				PreparedStatement preStmt = conn
						.prepareStatement("INSERT INTO pizzas (name, alcoholic, price, type) VALUES(?, ?, ?, ?)");
				preStmt.setString(1, drink.get(i).getName());
				preStmt.setBoolean(2, drink.get(i).isAlcoholic());
				preStmt.setFloat(3, drink.get(i).getPrice());
				preStmt.setString(4, drink.get(i).getType());
				preStmt.executeUpdate();
				System.out.println(drink.get(i).getName() + " added to database");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void viewDrinkID(int id) {
		this.connStmt("SELECT * FROM drinks WHERE id = " + id);
	}

}
