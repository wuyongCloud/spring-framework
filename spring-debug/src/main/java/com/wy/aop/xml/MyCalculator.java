package com.wy.aop.xml;

/**
 * @author yong.wu
 * @ProjectName weimob
 * @Description
 * @date 2021/10/28 11:03
 */
public class MyCalculator {
	public Integer add(Integer i, Integer j) throws NoSuchMethodException {
		Integer result = i+j;
		return result;
	}

	public Integer sub(Integer i, Integer j) throws NoSuchMethodException {
		Integer result = i-j;
		return result;
	}

	public Integer mul(Integer i, Integer j) throws NoSuchMethodException {
		Integer result = i*j;
		return result;
	}

	public Integer div(Integer i, Integer j) throws NoSuchMethodException {
		Integer result = i/j;
		return result;
	}

	public Integer show(Integer i){
		System.out.println("show .....");
		return i;
	}

	@Override
	public String toString() {
		return "super.toString()";
	}
}
