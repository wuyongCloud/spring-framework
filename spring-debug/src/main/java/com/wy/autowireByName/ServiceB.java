package com.wy.autowireByName;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

/**
 * @author yong.wu
 * @ProjectName weimob
 * @Description
 * @date 2021/10/12 15:41
 */
public class ServiceB implements InstantiationAwareBeanPostProcessor {

	private ServiceA serviceA;

	public ServiceA getServiceA() {
		return serviceA;
	}

	public void setServiceA(ServiceA serviceA) {
		this.serviceA = serviceA;
	}

	public void init(){
		System.out.println("执行initMethod");
	}

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("实例化之前执行");
		return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("实例化之后执行");
		return InstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		System.out.println("postProcessProperties 执行");
		return InstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
	}
}
