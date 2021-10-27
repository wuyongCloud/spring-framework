package com.wy.circularDepend;

/**
 * @author yong.wu
 * @ProjectName weimob
 * @Description
 * @date 2021/10/27 11:17
 */
public class StudentService {

	private PersonService personService;

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
}
