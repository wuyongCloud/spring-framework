package com.wy.day01;

import com.wy.entity.A;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yong.wu
 * @ProjectName cube
 * @Description
 * @date 2021/6/17 21:57
 */
public class TxTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("tx.xml");
		A bean = classPathXmlApplicationContext.getBean(A.class);
		System.out.println(bean.getId());
	}
}
