package com.mengsreang.springJavaAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaApplication {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Teacher javaTeacher = context.getBean("javaTeacher", Teacher.class);
		Teacher pythonTeacher = context.getBean("pythonTeacher", Teacher.class);
		Teacher goTeacher = context.getBean("goTeacher", Teacher.class);
		
		// call methods on the bean
		System.out.println(javaTeacher.getTeaching());
		System.out.println(javaTeacher.getTeachingHours());
		System.out.println(pythonTeacher.getTeaching());
		System.out.println(pythonTeacher.getTeachingHours());
		System.out.println(goTeacher.getTeaching());
		System.out.println(goTeacher.getTeachingHours());

		// close the context
		context.close();

	}

}
