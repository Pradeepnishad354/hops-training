package com.test.identify.array.reflection;

import java.lang.reflect.Field;

public class IdentifyArrayUsingReflectionTest {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		
		
		Class<?> c = Class.forName("com.test.identify.array.reflection.Person");
		
		Field[] fields = c.getDeclaredFields();
		for(Field f : fields) {
			
			Class<?> type = f.getType();
			
			// checking for array
			if(type.isArray()) {
				
				System.out.println(" Array found :"+f.getName());
			}
		}
	}

}
