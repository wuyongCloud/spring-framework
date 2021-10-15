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
public class ServiceB{

	private ServiceA serviceA;

	public ServiceA getServiceA() {
		return serviceA;
	}

	public void setServiceA(ServiceA serviceA) {
		this.serviceA = serviceA;
	}

	public void init2(){
		System.out.println("执行init2方法");
	}

	private void init(){
		System.out.println("执行initMethod");
	}

	public void xiaohui(){
		System.out.printf("销毁方法执行");
	}
}
