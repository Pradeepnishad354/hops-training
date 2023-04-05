package com.spring.core.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		
		 ApplicationContext  context= new ClassPathXmlApplicationContext("com/spring/core/autowired/autoconfig.xml");
		 
		 
		 Employee employee  = (Employee) context.getBean("emp");
		 
		System.out.println(employee);
	}

}
