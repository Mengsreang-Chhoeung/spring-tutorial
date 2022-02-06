package com.mengsreang.springJavaConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mengsreang.springJavaConfiguration.service.TeacherService;

@Component("javaTeacher")
@Scope("singleton")
public class JavaTeacher implements Teacher {
	
	private TeacherService teacherService;
	
	@Autowired
	public JavaTeacher(@Qualifier("teacherServiceImpl") TeacherService teacherService) {
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
