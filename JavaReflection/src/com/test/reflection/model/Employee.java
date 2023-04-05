package com.test.reflection.model;

public class Employee {

	private String name;

	private int age;

	public Employee(String name, int age) {

		this.name = name;
		this.age = age;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getName() {

		return name;
	}
	
	public void setAge(int age) {
		
		this.age=age;
	}
	
	public int getAge() {
		
		return age;
	}

}
