package com.wy.populatebean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PolulatebeanTest {


	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("populatebean.xml");
		System.out.printf("111");
	}
}
