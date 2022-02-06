package com.mengsreang.springJavaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mengsreang.springJavaConfiguration.config.ApplicationConfiguration;

public class JavaApplication {

	public static void main(String[] args) {
		
		// load the spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		// retrieve bean from spring container
		Teacher javaTeacher = context.getBean("javaTeacher", Teacher.class);
		Teacher java = context.getBean("javaTeacher", Teacher.class);
		Teacher pythonTeacher = context.getBean("pythonTeacher", Teacher.class);
		Teacher python = context.getBean("pythonTeacher", Teacher.class);
		Teacher goTeacher = context.getBean("goTeacher", Teacher.class);
		Teacher rustTeacher = context.getBean("rustTeacher", Teacher.class);
		Teacher universityTeacher = context.getBean("universityTeacher", Teacher.class);
		UniversityTeacher university = context.getBean("universityTeacher", UniversityTeacher.class);
		
		// call methods on the bean
		System.out.println(javaTeacher.getTeaching());
		System.out.println(javaTeacher.getTeachingHours());
		System.out.println(pythonTeacher.getTeaching());
		System.out.println(pythonTeacher.getTeachingHours());
		System.out.println(goTeacher.getTeaching());
		System.out.println(goTeacher.getTeachingHours());
		System.out.println(rustTeacher.getTeaching());
		System.out.println(rustTeacher.getTeachingHours());
		System.out.println(universityTeacher.getTeaching());
		System.out.println(universityTeacher.getTeachingHours());
		
		boolean isJavaResult = ( javaTeacher == java );
		boolean isPythonResult = ( pythonTeacher == python );
		System.out.println("Result of Java: " + isJavaResult);
		System.out.println("Result of Python: " + isPythonResult);
		
		System.out.println("University Teacher Name: " + university.getName());
		System.out.println("University Teacher Email: " + university.getEmail());

		// close the context
		context.close();

	}

}
