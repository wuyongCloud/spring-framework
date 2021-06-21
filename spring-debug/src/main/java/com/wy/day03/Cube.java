package com.wy.day03;

import lombok.Data;
import lombok.ToString;

/**
 * @author yong.wu
 * @ProjectName cube
 * @Description
 * @date 2021/6/21 15:26
 */
@ToString
public class Cube {
	private String name;
	private String phone;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
