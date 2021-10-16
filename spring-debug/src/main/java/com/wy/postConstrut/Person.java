package com.wy.postConstrut;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author yong.wu
 * @ProjectName weimob
 * @Description
 * @date 2021/10/14 10:55
 */
@Data
public class Person implements InitializingBean {

	private Integer id;

	private String name;

	public void init(){
		System.out.println("init ......");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("在bean初始化时执行 在beanPostProcessor PostProcessorsBeforeInitialization 之后；在PostProcessorsAfterInitialization 之前执行");
	}
}
