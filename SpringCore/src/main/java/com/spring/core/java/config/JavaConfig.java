package com.spring.core.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

//@ComponentScan(basePackages = "com.spring.core.java.config")
public class JavaConfig {

	
	//we can give the bean name and it can be access by any bean bean which given below 
	@Bean(name={"student","config","stu"})
	public Student getStudent() {

		Student student = new Student(getSamosa());

		return student;
	}

	@Bean
	public Samosa getSamosa() {

		return new Samosa();
	}
}
