package com.test.generic.interface1;

public class GenericClientTest {
	public static void main(String[] args) {
		
		
		GImple1<Integer> g = new GImple1<>();
		g.setValue(1000);
		Integer value = g.getValue();
		System.out.println(value);
	}

}
