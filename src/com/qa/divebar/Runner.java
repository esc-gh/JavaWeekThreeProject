package com.qa.divebar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
	private static List<Drink> drinks = new ArrayList<>();

	public static void main(String[] args) {
		JDBC_Setup jdbc_Setup = new JDBC_Setup();
		jdbc_Setup.connect();
	}

	public static void addItem(Drink... i) {
		drinks.addAll(Arrays.asList(i));
	}

}
