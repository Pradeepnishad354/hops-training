package com.test.privatee.method;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// accessing privATE METHOD USING REFLECTIONS
public class ReflectionTest1 {
	private static final Object String = null;


	public static void main(String[] args)   {
		
		try {
		Class<?> c = Class.forName("com.test.privatee.method.Welcome");
		
		 Method method = c.getDeclaredMethod("peek",String.class);
		 
		 method.setAccessible(true);
		 Object object = method.invoke(new Welcome(),"pradeep");
		 
		 System.out.println("access private method + "+object);
	}catch(ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
		
		
		e.printStackTrace();
	}

		// private variable access through reflection
		try {
		Class<?> c1 = Class.forName("com.test.privatee.method.Welcome");
		Field field = c1.getDeclaredField("message");
		      
		field.setAccessible(true);
		Object object = field.get(new Welcome());
		
	
	
String 	result1=(String)object;
	System.out.println("access private variable +"+result1);
		
	
		 
	}catch(ClassNotFoundException | SecurityException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException e) {
		
		
		e.printStackTrace();
	}
		
}
}