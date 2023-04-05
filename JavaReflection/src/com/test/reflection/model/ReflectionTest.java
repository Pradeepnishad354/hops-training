package com.test.reflection.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTest {

	public static void main(String[] args) {

		// 1. getting the constructor of the class
		try {
			Class<?> c = Class.forName("com.test.reflection.model.Employee");

			System.out.println("-------------getting the constructor of the class--------------------");

			Constructor<?>[] constructor = c.getConstructors();
			System.out.println("constructor: " + Arrays.toString(constructor));
			// 2. getting all the methods(even inherited) of the class

			System.out
					.println("---------------getting all the methods(even inherited) of the class ------------------");
			Method[] methods = c.getMethods();

			System.out.println("methods" + Arrays.toString(methods));
			// 3. getting methods of the class
			System.out.println("------------getting methods of the class---------------------");

			Method[] m = c.getDeclaredMethods();

			System.out.println("declare methods" + Arrays.toString(m));
			// 4. getting fields of the class

			Field[] f = c.getDeclaredFields();
			System.out.println("fileds" + Arrays.toString(f));

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		}
	}
}
