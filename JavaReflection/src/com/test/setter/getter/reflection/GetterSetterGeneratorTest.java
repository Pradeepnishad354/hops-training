package com.test.setter.getter.reflection;

import java.lang.reflect.Field;
import java.util.Arrays;

public class GetterSetterGeneratorTest {

public static void main(String[] args) {
		
		try {
		
		Class<?> c = Class.forName("com.test.setter.getter.reflection.Student");
		
		// get all the fields name of Student
		 Field[] fields = c.getDeclaredFields();
		System.out.println("all fields name of student class "+Arrays.toString(fields));
		
		StringBuffer sb = new StringBuffer();
		
		for(Field field: fields) {
			
			String fieldName = field.getName();
			String  fieldType = field.getType().getSimpleName();
			
			System.out.println("Field Name "+fieldName);
			System.out.println("filed type "+fieldType);
			
			CommonUtils.createSetter(fieldName, fieldType,sb);
			CommonUtils.createGetter(fieldName,fieldType,sb );
			
		}
		
		System.out.println(sb.toString());
		
	}catch(Exception e) {
		
		e.printStackTrace();
	}
	}
}
