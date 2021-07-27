package com.wy.entity;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;

/**
 * @author yong.wu
 * @ProjectName cube
 * @Description
 * @date 2021/6/17 21:42
 */
@Data
public class B implements InitializingBean, SmartInitializingSingleton {
	private String name;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean afterPropertiesSet 执行");
	}

	@Override
	public void afterSingletonsInstantiated() {
		System.out.println("SmartInitializingSingleton afterSingletonsInstantiated 执行");
	}
}
