package com.wy.day02;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * @author yong.wu
 * @ProjectName cube
 * @Description
 * @date 2021/6/18 18:20
 */
public class MySelfBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	/**
	 * 可以对BeanDefination 进行修改
	 * @param beanFactory the bean factory used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition dynamicBean = beanFactory.getBeanDefinition("dynamicBean");
		dynamicBean.getPropertyValues().getPropertyValue("name").setConvertedValue("李四");
		System.out.println("执行了MySelfBeanDefinitionRegistryPostProcessor postProcessBeanFactory 方法");
	}

	/**
	 * 动态注册Bean
	 * @param registry the bean definition registry used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(DynamicBean.class);
		builder.addPropertyValue("name","张三");
		registry.registerBeanDefinition("dynamicBean",builder.getBeanDefinition());
		System.out.println("执行了MySelfBeanDefinitionRegistryPostProcessor postProcessBeanDefinitionRegistry 方法");
	}
}
