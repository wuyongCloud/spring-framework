package com.wy.day03;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

/**
 * @author yong.wu
 * @ProjectName cube
 * @Description
 * @date 2021/6/21 15:27
 */
public class CubeBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class<?> getBeanClass(Element element) {
		return Cube.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		builder.addPropertyValue("name",element.getAttribute("name"));
		builder.addPropertyValue("phone",element.getAttribute("phone"));
		builder.addPropertyValue("address",element.getAttribute("address"));
	}
}
