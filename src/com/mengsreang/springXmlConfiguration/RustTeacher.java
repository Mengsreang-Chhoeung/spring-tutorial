package com.mengsreang.springXmlConfiguration;

import com.mengsreang.springXmlConfiguration.service.TeacherService;

public class RustTeacher implements Teacher {
	
	private TeacherService teacherService;
	
	public RustTeacher(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	@Override
	public String getTeaching() {
		return "He is Teaching Rust Language";
	}

	@Override
	public String getTeachingHours() {
		String msg = "He teaches Rust Language 2 hours in a day";
		return this.teacherService.getTeachingHours(msg);
	}
	
	public void initMethod() {
		System.out.println("Hello Rust Teacher");
	}
	
	public void destroyMethod() {
		System.out.println("Good Bye Rust Teacher");
	}

}
