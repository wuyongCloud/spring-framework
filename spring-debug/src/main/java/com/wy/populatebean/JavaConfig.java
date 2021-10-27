package com.wy.populatebean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yong.wu
 * @ProjectName weimob
 * @Description
 * @date 2021/10/27 10:10
 */
@Configuration
public class JavaConfig {


	@Bean
	public Address address(){
		return new Address();
	}
}
