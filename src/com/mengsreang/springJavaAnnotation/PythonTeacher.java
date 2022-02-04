package com.mengsreang.springJavaAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.mengsreang.springJavaAnnotation.service.TeacherService;

@Component
public class PythonTeacher implements Teacher {

	private TeacherService teacherService;
	
	@Value("Kok Dara")
	private String name;
	@Value("${app.teacher.email}")
	private String email;
	
	@Autowired
	public void setTeacherService(@Qualifier("teacherServiceImpl") TeacherService teacherService) {
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
