package com.spring.core.java.config;

import org.springframework.stereotype.Component;


public class Student {

	public void Study() {
		this.samosa.disp();

		System.out.println("redaing the book");
	}

	private Samosa samosa;

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	@Override
	public String toString() {
		return "Student [samosa=" + samosa + "]";
	}

}
