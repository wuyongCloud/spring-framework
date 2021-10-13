package com.wy.supplier;

import com.wy.day07.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class MySupplierBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition user = beanFactory.getBeanDefinition("user");
		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) user;
		genericBeanDefinition.setInstanceSupplier(MySupplier::createUser);
		genericBeanDefinition.setBeanClass(UserSupplier.class);
	}
}
