package com.mengsreang.springJavaConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.mengsreang.springJavaConfiguration.service.TeacherService;

public class UniversityTeacher implements Teacher {
	
	private TeacherService teacherService;
	@Value("${app.teacher.name}")
	private String name;
	@Value("${app.teacher.email}")
	private String email;
	
	@Autowired
	public UniversityTeacher(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	@Override
	public String getTeaching() {
		return "He is Teaching at University";
	}
	
	@Override
	public String getTeachingHours() {
		return this.teacherService.getTeachingHours("");
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}

}
