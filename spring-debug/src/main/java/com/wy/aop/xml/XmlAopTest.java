package com.wy.aop.xml;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author yong.wu
 * @ProjectName weimob
 * @Description
 * @date 2021/10/28 13:54
 */
public class XmlAopTest {
	public static void main(String[] args) throws Exception {
		testAop();
//		testCglib();
	}

	public static void testAop()throws Exception{
		saveGeneratedCGlibProxyFiles(System.getProperty("user.dir")+"/proxy");
		ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
		MyCalculator bean = ac.getBean(MyCalculator.class);
		System.out.println(bean.toString());
		bean.add(1,1);
		bean.sub(1,1);

	}

	public static void saveGeneratedCGlibProxyFiles(String dir) throws Exception {
		Field field = System.class.getDeclaredField("props");
		field.setAccessible(true);
		Properties props = (Properties) field.get(null);
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, dir);//dir为保存文件路径
		props.put("net.sf.cglib.core.DebuggingClassWriter.traceEnabled", "true");
	}


	public static void testCglib() throws NoSuchMethodException {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(MyCalculator.class);
		enhancer.setCallback(new ProxyTest());
		MyCalculator myCalculator1 = (MyCalculator) enhancer.create();
		myCalculator1.add(1,1);

	}

	static class ProxyTest implements MethodInterceptor{

		@Override
		public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
			System.out.println("before");
			Object invoke = methodProxy.invokeSuper(o, objects);
			System.out.println("after");
			return invoke;
		}
	}

}
