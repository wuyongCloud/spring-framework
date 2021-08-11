package com.wy.resolveBeforeInstantiation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yong.wu
 * @ProjectName weimob
 * @Description
 * @date 2021/8/11 18:23
 */
public class TestBeforeInstation {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resolveBefore.xml");
		BeforeInstation beforeInstation = ((BeforeInstation) context.getBean("beforeInstation"));
		System.out.printf("111");

	}
}
