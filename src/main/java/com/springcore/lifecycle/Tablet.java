package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Tablet {

	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Tablet() {
		super();
	}

	@Override
	public String toString() {
		return "Tablet [companyName=" + companyName + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("Calling init method using annotation");
	}

	@PreDestroy
	public void end() {
		System.out.println("Calling destroy method using annotation");
	}

}
