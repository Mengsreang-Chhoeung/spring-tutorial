package com.mengsreang.springJavaAnnotation.service.implementation;

import org.springframework.stereotype.Component;
import com.mengsreang.springJavaAnnotation.service.TeacherService;

@Component
public class UniversityTeacherServiceImpl implements TeacherService {

	@Override
	public String getTeachingHours(String msg) {
		return "University teacher always teach 8 hours in a day";
	}

}
