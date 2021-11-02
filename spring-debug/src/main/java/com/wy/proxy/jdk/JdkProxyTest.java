package com.wy.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yong.wu
 * @ProjectName weimob
 * @Description
 * @date 2021/11/2 18:11
 */
public class JdkProxyTest {

	public static void main(String[] args) {
		/**
		 * 参考类 ProxyGenerator 里的参数
		 */
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");


		MyServiceImpl myServiceImpl = new MyServiceImpl();
		Class<? extends MyServiceImpl> myServiceClass = myServiceImpl.getClass();
		MyService myService =(MyService) Proxy.newProxyInstance(myServiceClass.getClassLoader(), myServiceClass.getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("装上翅膀");
				Object invoke = method.invoke(myServiceImpl, args);
				System.out.println("果然飞不起来");
				return invoke;
			}
		});
		myService.fly();
		System.out.println(111);
	}
}
