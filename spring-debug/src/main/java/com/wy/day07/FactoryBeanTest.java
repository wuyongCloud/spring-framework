package com.wy.day07;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yong.wu
 * @ProjectName cube
 * @Description
 * @date 2021/7/26 11:29
 */
public class FactoryBeanTest {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("factoryBean.xml");
		UserFactoryBean bean = classPathXmlApplicationContext.getBean(UserFactoryBean.class);
		User user = classPathXmlApplicationContext.getBean(User.class);
		User user1 = classPathXmlApplicationContext.getBean(User.class);
		System.out.println(11);

	}

}
