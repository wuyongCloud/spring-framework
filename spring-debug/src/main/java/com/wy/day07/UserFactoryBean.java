package com.wy.day07;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author yong.wu
 * @ProjectName cube
 * @Description
 * @date 2021/7/26 11:35
 */
public class UserFactoryBean implements FactoryBean<User> {

	@Override
	public User getObject() throws Exception {
		return new User("wuyong");
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
