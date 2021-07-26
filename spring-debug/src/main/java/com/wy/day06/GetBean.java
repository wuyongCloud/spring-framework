package com.wy.day06;

import com.wy.entity.A;
import com.wy.entity.B;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yong.wu
 * @ProjectName cube
 * @Description
 * @date 2021/7/23 17:02
 */
public class GetBean {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("getBean.xml");
		B bean = classPathXmlApplicationContext.getBean(B.class);
		System.out.println(111);
	}
}
