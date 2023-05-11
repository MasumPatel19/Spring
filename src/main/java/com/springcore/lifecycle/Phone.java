package com.springcore.lifecycle;

public class Phone {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price.");
		this.price = price;
	}

	public Phone() {
		super();
	}

	@Override
	public String toString() {
		return "Phone [price=" + price + "]";
	}

	public void init() {
		System.out.println("Inside init()");
	}

	public void destroy() {
		System.out.println("Inside destroy()");
	}

}
