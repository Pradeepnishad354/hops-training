package com.test.reflection.model.metadata;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionMeta {
	public static void main(String[] args) {

		try {
			Class<?> c1 = Class.forName("com.test.reflection.model.metadata.Child");
			// 1.to get the class name

			System.out.println("Class name :" + c1.getName());// its give fullyclass name

			System.out.println("Class name :" + c1.getSimpleName());

			// 2.getting super class using reflection

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Class<?> c2 = Class.forName("com.test.reflection.model.metadata.Child");
			// 2.getting super class using reflection

			System.out.println("super Class name :" + c2.getSuperclass());// its give fullyclass name

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Class<?> c3 = Class.forName("com.test.reflection.model.metadata.Child");
			// 3.getting implemented interface or extend interface using reflection

			System.out.println("Interface name :" + Arrays.toString(c3.getInterfaces()));
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		// 4.getting class modifier using reflection

		try {
			Class<?> c4 = Class.forName("com.test.reflection.model.metadata.Child");

			int modifiers = c4.getModifiers();

			System.out.println("class modifier name :" + Modifier.toString(modifiers));
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		// 5.getting the fields of class
		try {
			Class<?> c5 = Class.forName("com.test.reflection.model.metadata.Child");

			Field[] allFields = c5.getFields();// public fields in class and public interfaces

			System.out.println("All fieds name :" + Arrays.toString(allFields));

			// getting fields of the class

			Field[] declaredFields = c5.getDeclaredFields();

			System.out.println("declaration fields" + Arrays.toString(declaredFields));
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		// 6.getting constructor using reflection

		try {
			Class<?> c6 = Class.forName("com.test.reflection.model.metadata.Child");
			
Constructor<?>[] constructors = c6.getConstructors();
			System.out.println("Constructor ::"+Arrays.toString(constructors));//its return only public constru

			Constructor<?>[] declaredConstructors = c6.getDeclaredConstructors();
			System.out.println("declared Constructors "+Arrays.toString(declaredConstructors));
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		
		//7.getting method of the class using reflection
		
		try {
			Class<?> c7 = Class.forName("com.test.reflection.model.metadata.Child");
			//getting all the methods (even inherited method)
			Method[] methods = c7.getMethods();

			System.out.println("All methods  ::"+Arrays.toString(methods));
             // getting method of class 
			
			methods= c7.getDeclaredMethods();
			System.out.println("class method :"+Arrays.toString(methods));
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
		//8.getting annotations using reflection
		
		try {
			Class<?> c8 = Class.forName("com.test.reflection.model.metadata.Child");
			
			Annotation[] annotations = c8.getAnnotations();

			System.out.println("annotations  ::"+Arrays.toString(annotations));
             
			 Annotation[] declaredAnnotations = c8.getDeclaredAnnotations();
			System.out.println("declaredAnnotations :"+Arrays.toString(declaredAnnotations));
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
		
	}

}
