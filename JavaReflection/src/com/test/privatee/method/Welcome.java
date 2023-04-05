package com.test.privatee.method;

public class Welcome {
	private int a=5;
	private String message="mahadev";
	private String peek(String name) {
		
		if(name==null || name.isEmpty()) {
			
			System.out.println("hello staranger");
		}
		return "hello"+name;
	}

}
