package com.spring.core.java.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new  AnnotationConfigApplicationContext(JavaConfig.class);

		//by default bean name 
//		Student student = (Student) context.getBean("getStudent");
		
		Student student = (Student) context.getBean("student");

		System.out.println(student);
		student.Study();

	}
}
