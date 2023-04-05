package com.test.reflection.model.metadata;

public class Child extends Parent implements Interfacee{

	private String value;

	public Child(String name, int age, String value) {
		super(name, age);
		this.value = value;
	}
	

	public void setValue(String value) {

		this.value = value;

	}

	public String getvalue() {

		return value;
	}
	


	@Override
	public void show() {
		System.out.println("show method");
		
	}

}
