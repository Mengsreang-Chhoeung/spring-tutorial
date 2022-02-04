package com.mengsreang.springJavaAnnotation.service.implementation;

import org.springframework.stereotype.Component;
import com.mengsreang.springJavaAnnotation.service.TeacherService;

@Component
public class TeacherServiceImpl implements TeacherService {

	@Override
	public String getTeachingHours(String msg) {
		return msg;
	}

}
