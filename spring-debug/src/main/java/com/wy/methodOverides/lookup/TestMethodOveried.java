package com.wy.methodOverides.lookup;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMethodOveried {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("lookup.xml");
		FruitPlate fruitPlate1 = (FruitPlate) applicationContext.getBean("fruitPlate1");
		Fruit fruit = fruitPlate1.getFruit();
		FruitPlate fruitPlate2 = (FruitPlate) applicationContext.getBean("fruitPlate2");
		Fruit fruit1 = fruitPlate2.getFruit();
		System.out.printf("11");


	}
}
