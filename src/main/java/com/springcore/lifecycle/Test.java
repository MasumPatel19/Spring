package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifecycleconfig.xml");
		Phone p1 = (Phone) context.getBean("phone");
		System.out.println(p1);

		Laptop l1 = (Laptop) context.getBean("laptop");
		System.out.println(l1);

		Tablet t1 = (Tablet) context.getBean("tablet");
		System.out.println(t1);

		context.registerShutdownHook();
	}

}
