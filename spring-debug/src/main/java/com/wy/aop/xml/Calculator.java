package com.wy.aop.xml;

/**
 * @author yong.wu
 * @ProjectName weimob
 * @Description
 * @date 2021/10/28 11:03
 */
public interface Calculator {
	public Integer add(Integer i,Integer j) throws NoSuchMethodException;
	public Integer sub(Integer i,Integer j) throws NoSuchMethodException;
	public Integer mul(Integer i,Integer j) throws NoSuchMethodException;
	public Integer div(Integer i,Integer j) throws NoSuchMethodException;
}
