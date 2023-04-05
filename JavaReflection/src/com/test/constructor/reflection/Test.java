package com.test.constructor.reflection;

public class Test {
	
	private String name;
	private int value;
	
	// [public constructor 
	public Test(String name,int value) {
		
		this.name=name;
		this.value=value;
		
	}
	
	// private constructor
	private Test() {
		
		
	}
	

	public void showValue() {
		
		System.out.println(""+value+" " + name);
	}
}
