package com.mengsreang.springXmlConfiguration;

import com.mengsreang.springXmlConfiguration.service.TeacherService;

public class JavaTeacher implements Teacher {
	
	private TeacherService teacherService;
	
	public JavaTeacher(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	@Override
	public String getTeaching() {
		
		return "He is Teaching Java Language";
		
	}
	
	@Override
	public String getTeachingHours() {
		String msg = "He teaches Java Language 8 hours in a day";
		return this.teacherService.getTeachingHours(msg);
	}
	
}
