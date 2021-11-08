package com.wy.day03;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author yong.wu
 * @ProjectName cube
 * @Description
 * @date 2021/6/21 15:31
 */
public class CubeNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		// 注册对应的标签解析器
		registerBeanDefinitionParser("weimob",new CubeBeanDefinitionParser());
	}
}
