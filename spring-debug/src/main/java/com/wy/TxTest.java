package com.wy;

import com.wy.day02.DynamicBean;
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
		DynamicBean d = classPathXmlApplicationContext.getBean(DynamicBean.class);
		System.out.println(d);
	}
}
