package com.test.generic.method;

public class MyGenericClass<T> {

	private T[] arr;

	public MyGenericClass(T[] arr) {
		this.arr = arr;

	}

	public T[] getArr() {

		return arr;
	}

	public <E> void printElement(E[] arr) {

		for (E e : arr) {

			System.out.println(e);
		}
	}
}
