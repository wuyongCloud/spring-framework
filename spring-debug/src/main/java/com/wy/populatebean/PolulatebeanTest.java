package com.wy.populatebean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PolulatebeanTest {


	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("populateBean.xml");
		ac.close();
	}
}
