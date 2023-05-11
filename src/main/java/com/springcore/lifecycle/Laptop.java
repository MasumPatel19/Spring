package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Laptop implements InitializingBean, DisposableBean {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Laptop() {
		super();
	}

	@Override
	public String toString() {
		return "Laptop [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init call using interface");
	}

	public void destroy() throws Exception {
		System.out.println("destory call using interface");
	}

}
