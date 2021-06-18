package com.wy.day01;

import com.wy.entity.Address;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.propertyeditors.PropertiesEditor;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yong.wu
 * @ProjectName cube
 * @Description
 * @date 2021/6/18 14:36
 */
public class AddressEditor extends PropertyEditorSupport{

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] s = text.split("_");
		Address address = new Address();
		address.setProvince(s[0]);
		address.setCity(s[1]);
		address.setCountry(s[2]);
		setValue(address);
	}
}
