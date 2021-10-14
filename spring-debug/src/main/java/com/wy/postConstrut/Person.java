package com.wy.postConstrut;

import lombok.Data;

/**
 * @author yong.wu
 * @ProjectName weimob
 * @Description
 * @date 2021/10/14 10:55
 */
@Data
public class Person {

	private Integer id;

	private String name;

	public void init(){
		System.out.println("init ......");
	}


}
