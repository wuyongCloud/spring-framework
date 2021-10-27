package com.wy.circularDepend;

/**
 * @author yong.wu
 * @ProjectName weimob
 * @Description
 * @date 2021/10/27 11:16
 */
public class PersonService {

	private StudentService studentService;

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
}
