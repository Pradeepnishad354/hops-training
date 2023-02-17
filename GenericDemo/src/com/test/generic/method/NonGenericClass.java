package com.test.generic.method;

public class NonGenericClass {
	
	public <E> void printElement(E[] arr) {

		for (E e : arr) {

			System.out.println(e);
		}
	}

}
