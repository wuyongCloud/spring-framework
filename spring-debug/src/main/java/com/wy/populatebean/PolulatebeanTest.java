package com.wy.populatebean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PolulatebeanTest {


	public static void main(String[] args) {
//		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("populateBean.xml");
//		ac.close();


		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		System.out.println(11);
		annotationConfigApplicationContext.close();
	}
}
