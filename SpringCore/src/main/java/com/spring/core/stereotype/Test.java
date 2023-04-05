package com.spring.core.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/stereotype/stereoconfig.xml");

		// its make it camel case
//		Student student = (Student) context.getBean("student");
		Student student = (Student) context.getBean("ob");
		System.out.println(student);

		System.out.println(student.getPhones());

		System.out.println(student.getPhones().getClass().getName());

		// bean scope
		// singleton bean scope
		System.out.println(student.hashCode());

		Student student2 = (Student) context.getBean("ob");

		System.out.println(student2.hashCode());
		
		Teacher Teacher1 = (Teacher) context.getBean("teacher");
		Teacher Teacher2 = (Teacher) context.getBean("teacher");
		
		System.out.println(Teacher1.hashCode());
		System.out.println(Teacher2.hashCode());
	}

}
