package com.spring.core.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/spring/core/standalone/collection/aloneconfig.xml");
		
		Person per = context.getBean("person",Person.class);
		System.out.println(per);
		System.out.println(per.getFriends().getClass().getName());
		
		System.out.println(" map ---------------");
		System.out.println(per.getFeeStructure());
		
		System.out.println(per.getFeeStructure().getClass().getName());
		
		System.out.println(per.getProperty());
		
		 
	}
}
