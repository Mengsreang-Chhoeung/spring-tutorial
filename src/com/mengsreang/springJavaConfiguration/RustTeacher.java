package com.mengsreang.springJavaConfiguration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mengsreang.springJavaConfiguration.service.TeacherService;

@Component
public class RustTeacher implements Teacher {
	
	private TeacherService teacherService;
	
	@Autowired
	public RustTeacher(@Qualifier("teacherServiceImpl") TeacherService teacherService) {
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
	
	@PostConstruct
	public void initMethod() {
		System.out.println("Hello Rust Teacher");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("Good Bye Rust Teacher");
	}

}
