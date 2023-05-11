package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/auto/wire/annotation/autoconfig.xml");

//		Address add = (Address) context.getBean("address");
//		System.out.println(add);

//		Employee emp = (Employee) context.getBean("employee");
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp);

	}

}
