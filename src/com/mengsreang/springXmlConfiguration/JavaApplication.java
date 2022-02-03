package com.mengsreang.springXmlConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaApplication {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Teacher javaTeacher = context.getBean("javaTeacher", Teacher.class);
		Teacher java = context.getBean("java", Teacher.class);
		Teacher pythonTeacher = context.getBean("pythonTeacher", Teacher.class);
		Teacher goTeacher = context.getBean("goTeacher", Teacher.class);
		Teacher go = context.getBean("goTeacher", Teacher.class);
		Teacher rustTeacher = context.getBean("rustTeacher", Teacher.class);
		
		// call methods on the bean
		System.out.println(javaTeacher.getTeaching());
		System.out.println(javaTeacher.getTeachingHours());
		System.out.println(java.getTeaching());
		System.out.println(java.getTeachingHours());
		System.out.println(pythonTeacher.getTeaching());
		System.out.println(pythonTeacher.getTeachingHours());
		
		boolean result = ( goTeacher == go );
		System.out.println("Result: " + result);
		System.out.println("Object GoTeacher One: " + goTeacher);
		System.out.println("Object GoTeacher Two: " + go);
		
		System.out.println(rustTeacher.getTeaching());
		
		// close the context
		context.close();

	}

}
