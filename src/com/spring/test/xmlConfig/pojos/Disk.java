package com.spring.test.xmlConfig.pojos;

public class Disk {

	private String title;
	private double price;
	private String type;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String toString() {
		return "Disk [title=" + title + ", price=" + price + ", type=" + type
				+ "]";
	}
	public Disk() {
		super();
	}
	
}
