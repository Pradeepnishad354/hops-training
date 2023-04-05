package com.test.reflection.model.metadata;

public class Parent {

	private String name;

	private int age;

	public Parent(String name, int age) {

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

		this.age = age;
	}

	public int getAge() {

		return age;
	}
}
