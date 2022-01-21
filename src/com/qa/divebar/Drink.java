package com.qa.divebar;

public class Drink {
	private int id;
	private String name;
	private boolean alcoholic;
	private float price;
	private String type;

	public Drink(String name, boolean alcoholic, float price, String type) {
		super();
		this.name = name;
		this.alcoholic = alcoholic;
		this.price = price;
	}

	public Drink(int id, String name, boolean alcoholic, float price, String type) {
		super();
		this.id = id;
		this.name = name;
		this.alcoholic = alcoholic;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlcholic() {
		return alcoholic;
	}

	public void setAlcholic(boolean alcholic) {
		this.alcoholic = alcholic;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Pizza [id=" + id + ", name =" + name + ", alcoholic" + alcoholic + ", price =" + price + ", type = "
				+ type + "]";
	}

}
