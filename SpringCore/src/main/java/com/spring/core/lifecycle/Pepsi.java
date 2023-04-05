package com.spring.core.lifecycle;

public class Pepsi {

	private double price;

	public double getPrice() {
		return price;
		
		
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("set the property");
	}

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	
	public void init() {
		
		System.out.println("init method call");
		
	}
	
	public void destroy() {
		System.out.println("destroy method call");
	}
	
}
