package com.springcore.javaconfig.beanannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaconfig {

	@Bean
	public Marks getMark() {
		return new Marks();
	}

	@Bean
	public Student getData() {
		Student student = new Student(getMark());
		return student;
	}

}
