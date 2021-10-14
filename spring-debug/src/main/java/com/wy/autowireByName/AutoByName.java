package com.wy.autowireByName;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yong.wu
 * @ProjectName weimob
 * @Description
 * @date 2021/10/12 15:44
 */
public class AutoByName {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("autowireByName.xml");
		ServiceB serviceB = (ServiceB)classPathXmlApplicationContext.getBean("serviceB");
		System.out.println(serviceB.getServiceA());

	}
}
