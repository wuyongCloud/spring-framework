package com.wy.day01;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * @author yong.wu
 * @ProjectName cube
 * @Description
 * @date 2021/6/18 18:20
 */
public class MySelfBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("执行了MySelfBeanDefinitionRegistryPostProcessor postProcessBeanFactory 方法");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("执行了MySelfBeanDefinitionRegistryPostProcessor postProcessBeanDefinitionRegistry 方法");
	}
}
