package com.mengsreang.springJavaAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mengsreang.springJavaAnnotation.service.TeacherService;

@Component
public class GoTeacher implements Teacher {
	
	@Autowired
	@Qualifier("teacherServiceImpl")
	private TeacherService teacherService;

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
