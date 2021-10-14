package com.wy.supplier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSupplier {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("supplier.xml");
		UserSupplier user = (UserSupplier) context.getBean("user");
		System.out.println(user);
	}
}
