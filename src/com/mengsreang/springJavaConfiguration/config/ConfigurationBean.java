package com.mengsreang.springJavaConfiguration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import com.mengsreang.springJavaConfiguration.Teacher;
import com.mengsreang.springJavaConfiguration.UniversityTeacher;
import com.mengsreang.springJavaConfiguration.service.TeacherService;
import com.mengsreang.springJavaConfiguration.service.implementation.UniversityTeacherServiceImpl;

@Configuration
@PropertySource("classpath:application.properties")
public class ConfigurationBean {
	
	@Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
	
	@Bean
	public TeacherService universityTeacherService() {
		return new UniversityTeacherServiceImpl();
	}
	
	@Bean
	public Teacher universityTeacher() {
		return new UniversityTeacher(universityTeacherService());
	}
	
}
