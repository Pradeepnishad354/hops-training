package com.test.constructor.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class CreateInstanceUsingReflection {
// createInstance Constructor using reflection 
	public static void main(String[] args) {

		try {
			Class<?> c = Class.forName("com.test.constructor.reflection.Test");

			//get all the constructor
			Constructor<?>[] cons = c.getDeclaredConstructors();

			for (Constructor<?> con : cons) {

				System.out.println(" constructor " + con.getName());

				Test test;//pass reference of the class

				if (Modifier.toString(con.getModifiers()).equals("private")) {
					// setting accessibility to true if it is private constructor
					
					con.setAccessible(true);
					test = (Test) con.newInstance();
				} else {

					test = (Test) con.newInstance("pradeep", 200);
				}
				test.showValue();

			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
