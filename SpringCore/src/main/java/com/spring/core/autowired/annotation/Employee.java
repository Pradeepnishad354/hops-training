package com.spring.core.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	
	private Address address;

	public Address getAddress() {
		return address;
	}
	@Autowired
	@Qualifier("address2")
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("setting value");
	}

	public Employee(Address address) {
		super();
		this.address = address;

		System.out.println("constractur call");
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	

}
