package com.test.collection.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> a = new ArrayList<>();
		
		a.add(new Employee(4,"pradeep","jaunpur"));
		a.add(new Employee(3,"amit","varanasi"));
		a.add(new Employee(7,"roshan","bihar"));
		a.add(new Employee(5,"Henil","ahd"));
		a.add(new Employee(1,"ritesh","varanasi"));
		
		// using comprable
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		
		Collections.sort(a,new IdComparator());
		System.out.println(a);
		
		
		// using comparator o
//		Collections.sort(a,new NameComparator());
//		System.out.println(a);
//		
		ArrayList<Employee> a2 = new ArrayList<>(a);
		
		Collections.sort(a2,new NameComparator());
		System.out.println(a2);
		
	
		
		
	}

}
