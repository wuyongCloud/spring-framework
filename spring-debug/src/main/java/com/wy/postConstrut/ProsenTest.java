package com.wy.postConstrut;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yong.wu
 * @ProjectName weimob
 * @Description
 * @date 2021/10/18 18:17
 */
public class ProsenTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("postConstrut.xml");
		Person bean = classPathXmlApplicationContext.getBean(Person.class);
		System.out.println(bean);
	}
}
