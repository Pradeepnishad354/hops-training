package com.test.collection.comparable.comparator;

import java.util.Comparator;
//using comparator
public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmpName().compareToIgnoreCase(o2.getEmpName());
	}

}
