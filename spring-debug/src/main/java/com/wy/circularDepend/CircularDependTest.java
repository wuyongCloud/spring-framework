package com.wy.circularDepend;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yong.wu
 * @ProjectName weimob
 * @Description 测试循环依赖
 * @date 2021/10/27 11:23
 */
public class CircularDependTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("circularDepend.xml");
		context.close();
	}
}
