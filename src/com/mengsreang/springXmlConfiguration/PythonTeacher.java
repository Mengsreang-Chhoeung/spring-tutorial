package com.mengsreang.springXmlConfiguration;

import com.mengsreang.springXmlConfiguration.service.TeacherService;

public class PythonTeacher implements Teacher {
	
	private TeacherService teacherService;
	private String name;
	private String email;
	
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
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
