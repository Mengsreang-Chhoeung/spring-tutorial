package com.mengsreang.springXmlConfiguration;

import com.mengsreang.springXmlConfiguration.service.TeacherService;

public class PythonTeacher implements Teacher {
	
	private TeacherService teacherService;
	
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	@Override
	public String getTeaching() {
		return "He is Teaching Python Language";
	}
	
	@Override
	public String getTeachingHours() {
		String msg = "He teaches Python Language 6 hours in a day";
		return this.teacherService.getTeachingHours(msg);
	}

}
