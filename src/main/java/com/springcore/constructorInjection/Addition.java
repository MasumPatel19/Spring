package com.springcore.constructorInjection;

public class Addition {

	private int n1;
	private int n2;

	public Addition(double n1, double n2) {
		this.n1 = (int) n1;
		this.n2 = (int) n2;
		System.out.println("double,double constructor");
	}

	public Addition(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
		System.out.println("int,int constructor");
	}

	public Addition(String n1, String n2) {
		this.n1 = Integer.parseInt(n1);
		this.n2 = Integer.parseInt(n2);
		System.out.println("string,string constructor");
	}

	public void addNumbers() {
		System.out.println("n1 : " + this.n1);
		System.out.println("n2 : " + this.n2);
		System.out.println("Addition of a numbers is : " + (this.n1 + this.n2));
	}

}
