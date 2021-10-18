package com.wy.postConstrut;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author yong.wu
 * @ProjectName weimob
 * @Description
 * @date 2021/10/14 10:55
 */
@Data
@Component
public class Person {

	private Integer id;

	private String name;

	@Resource
	private Student student;

	public void init(){
		System.out.println("init ......");
	}

}
