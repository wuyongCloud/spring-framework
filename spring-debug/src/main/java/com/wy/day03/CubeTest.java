package com.wy.day03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yong.wu
 * @ProjectName cube
 * @Description
 * @date 2021/6/21 15:45
 */
public class CubeTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("demo.xml");
		Cube bean = classPathXmlApplicationContext.getBean(Cube.class);
		System.out.println(bean);
	}
}
