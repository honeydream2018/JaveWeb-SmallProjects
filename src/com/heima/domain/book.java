package com.heima.domain;

public class book {
	private String id;
	private String name;
	private String author;
	private double price;
	private String descrption;
	public book() {}
	public book(String id, String name, String author, double price, String descrption) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.descrption = descrption;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	
	
}
