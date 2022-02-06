package com.mengsreang.springJavaConfiguration.service.implementation;

import org.springframework.stereotype.Component;

import com.mengsreang.springJavaConfiguration.service.TeacherService;

@Component
public class PrimarySchoolTeacherServiceImpl implements TeacherService {

	@Override
	public String getTeachingHours(String msg) {
		return "Primary school teacher always teach 4 hours in a day";
	}

}
