package com.mengsreang.springJavaConfiguration.service.implementation;

import org.springframework.stereotype.Component;

import com.mengsreang.springJavaConfiguration.service.TeacherService;

@Component
public class TeacherServiceImpl implements TeacherService {

	@Override
	public String getTeachingHours(String msg) {
		return msg;
	}

}
