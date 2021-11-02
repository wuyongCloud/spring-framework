package com.wy.proxy.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author yong.wu
 * @ProjectName weimob
 * @Description
 * @date 2021/11/2 18:40
 */
public class CglibTest {

	public static void main(String[] args) {
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"D:\\otherCode\\spring-framework\\com\\sun\\proxy");
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(MyCglibService.class);
		enhancer.setCallback(new MethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
				System.out.println("1111");
				Object o1 = methodProxy.invokeSuper(o, objects);
				return null;
			}
		});
		MyCglibService myCglibService = (MyCglibService)enhancer.create();
		myCglibService.fly();
		System.out.println(111);

	}
}
