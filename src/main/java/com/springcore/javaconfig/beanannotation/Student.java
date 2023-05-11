package com.springcore.javaconfig.beanannotation;

public class Student {

	private Marks marks;

	public Marks getMarks() {
		return marks;
	}

	public void setMarks(Marks marks) {
		this.marks = marks;
	}

	public Student(Marks marks) {
		super();
		this.marks = marks;
	}

	public void show() {
		marks.display();
		System.out.println("Inside show method");
	}

}
