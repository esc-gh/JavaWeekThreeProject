package com.qa.divebar;

public class Drinks {
	private int id;
	private String name;
	private boolean isAlcoholic;
	private float price;
	private String type;

	public Drinks(String name, boolean isAlcoholic, float price, String type) {
		super();
		this.name = name;
		this.isAlcoholic = isAlcoholic;
		this.type = type;
		this.price = price;
	}

	public Drinks(int id, String name, boolean isAlcoholic, float price, String type) {
		super();
		this.id = id;
		this.name = name;
		this.isAlcoholic = isAlcoholic;
		this.price = price;
		this.type = type;
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

	public boolean isAlcoholic() {
		return isAlcoholic;
	}

	public void setAlcoholic(boolean isAlcoholic) {
		this.isAlcoholic = isAlcoholic;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Drinks [id=" + id + ", name=" + name + ", isAlcoholic=" + isAlcoholic + ", price=" + price + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
