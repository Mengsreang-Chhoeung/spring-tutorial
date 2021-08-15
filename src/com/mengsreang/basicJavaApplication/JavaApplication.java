package com.mengsreang.basicJavaApplication;

public class JavaApplication {

	public static void main(String[] args) {
		
		// create the object
		Teacher javaTeacher = new JavaTeacher();
		Teacher pythonTeacher = new PythonTeacher();
		
		// use the object
		System.out.println(javaTeacher.getTeaching());
		System.out.println("\n" + pythonTeacher.getTeaching());

	}

}
