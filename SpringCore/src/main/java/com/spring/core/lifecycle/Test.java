package com.spring.core.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/lifecycle/config.xml");

//		Pepsi p = (Pepsi) context.getBean("s1");
//
//		System.out.println(p);
		context.registerShutdownHook();
//		
//		
//System.out.println("++++++++++++++++++++++++++++++++++++");
//
//
//Ring r=(Ring) context.getBean("r1");
//
//System.out.println(r);


System.out.println("_________________________________________________");

Example e=(Example) context.getBean("e1");
System.out.println(e);

	}

}
