package com.test.identify.array.reflection;

import java.lang.reflect.Array;

//setting and getting array  value using reflection
public class GetAndSetArrayUsingReflection {
	
	public static void main(String[] args) {
		
		
		
		double[] doubleArray= (double[])Array.newInstance(double.class, 5);
		System.out.println("length of the array "+doubleArray.length);
		
		//setting value using setDouble and Set method
		Array.setDouble(doubleArray, 0, 22.2);
		Array.set(doubleArray, 1, 10);
		Array.setDouble(doubleArray, 2, 20);
		Array.setDouble(doubleArray, 3, 0);
		
		// getting value using getDouble and get method
		
		System.out.println("first element "+Array.get(doubleArray,0));
		System.out.println("second element "+Array.getDouble(doubleArray,1));
		System.out.println("third element "+Array.get(doubleArray,2));
		System.out.println("fourth element "+Array.get(doubleArray,3));
		
		
		
	}

}
