package com.test.generic.interface3;

public class GenericClientTest3 {
	public static void main(String[] args) {
		
		GImple3<String, Integer> i = new GImple3<>();
		i.setValue("saurabh");
		i.setK(100);
		String value = i.getValue();
System.out.println(value);
		Integer k = i.getK();
		System.out.println(k);
	}

}
