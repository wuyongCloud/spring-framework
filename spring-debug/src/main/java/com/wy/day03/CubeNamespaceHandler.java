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
		registerBeanDefinitionParser("weimob",new CubeBeanDefinitionParser());
	}
}
