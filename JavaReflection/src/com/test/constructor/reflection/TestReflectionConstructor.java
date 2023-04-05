package com.test.constructor.reflection;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class TestReflectionConstructor {
	
	public static void main(String[] args) {
		
		
		// 1.get constructor with two args
		try {
		Class<?> c = Class.forName("com.test.constructor.reflection.Test");
		Constructor<?> constructor = c.getDeclaredConstructor(String.class,int.class);
		
		System.out.println("constructor "+constructor.toString());
		
		//2.getting all  public constructor of the class
		
		Constructor<?>[] constructors = c.getConstructors();
		System.out.println("all  public constructor  "+Arrays.toString(constructors));
		//3.getting the private constructor using getDeclaredConstructor()
		
		constructor = c.getDeclaredConstructor();
		System.out.println("private constructor  "+constructor);
		
		//4.to get all public, private,protected,default constructor
		
		Constructor<?>[] constructor2 = c.getDeclaredConstructors();
		
		System.out.println("get all constructor  "+Arrays.toString(constructor2));
	}catch(Exception e) {
		
		e.printStackTrace();
	}

}
}