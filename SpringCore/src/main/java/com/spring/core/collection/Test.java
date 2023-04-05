package com.spring.core.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/core/collection/collectionconfig.xml");

		Employee emp = (Employee) context.getBean("employee");
		System.out.println(emp);

		System.out.println("name"+emp.getName());
		System.out.println("phones "+ emp.getPhones());
		System.out.println("course"+emp.getCourse());
		System.out.println("city" +emp.getCity());
		
		System.out.println(emp.getPhones().getClass().getName());  
	}

}
