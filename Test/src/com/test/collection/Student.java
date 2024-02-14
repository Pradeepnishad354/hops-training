package com.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
	
	private int age;
	private String name;
	private String city;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int age, String name, String city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", city=" + city + "]";
	}
	public static void main(String[] args) {
		
		
	List<Student> st=new ArrayList<Student>();

	st.add(new Student(2, "ashu","varanasi"));
	st.add(new Student(5, "pritesh","mirzapur"));
	st.add(new Student(8, "pradeep","jaunpur"));
	st.add(new Student(4, "ritik","ahemdabad"));
	
	
	//Collections.sort(st,new AgeComprator());
	
	Collections.sort(st);
	
	System.out.println(st);

	
	
	}
	@Override
	public int compareTo(Student o) {
		
		return o.getName().compareTo(o.getName());
	}
	
	

}
