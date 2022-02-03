package com.mengsreang.springXmlConfiguration;

import com.mengsreang.springXmlConfiguration.service.TeacherService;

public class GoTeacher implements Teacher {
	
	private TeacherService teacherService;
	
	public GoTeacher(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	@Override
	public String getTeaching() {
		return "He is Teaching Go Language";
	}

	@Override
	public String getTeachingHours() {
		String msg = "He teaches Go Language 4 hours in a day";
		return this.teacherService.getTeachingHours(msg);
	}
	
}
