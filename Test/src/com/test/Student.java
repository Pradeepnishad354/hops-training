package com.test;

public class Student {
	
	int id;
	String name;
	
	
	
	
	public Student(int i,String n) {
		
		id=i;
		name=n;
		
		
	}
	
	public Student(Student s1) {
		
		
		id=s1.id;
		name=s1.name;
	}
		

	void display() {
		
		System.out.println("id "+id+"name "+name);
	}
	
	
	
	public static void main(String[] args) {
		
		
		Student s1=new Student(1," ashu");
		
		Student s2=new Student(s1);
		
		
		s1.display();
		s2.display();
		
	}
	
}
