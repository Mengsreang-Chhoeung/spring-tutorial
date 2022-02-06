package com.mengsreang.springJavaConfiguration.service.implementation;

import org.springframework.stereotype.Component;

import com.mengsreang.springJavaConfiguration.service.TeacherService;

@Component
public class HightSchoolTeacherServiceImpl implements TeacherService {

	@Override
	public String getTeachingHours(String msg) {
		return "Hight school teacher always teach 6 hours in a day";
	}

}
