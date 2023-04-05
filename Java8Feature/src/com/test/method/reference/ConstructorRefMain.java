package com.test.method.reference;

public class ConstructorRefMain {

	public static void main(String[] args) {
		
		
		System.out.println(" this is constructor refernce ");
		
		
//		Provider p=()->{
//			
//			return new Student();
//		};
		
		// constructor reference 
		Provider p=Student::new ;
		
		Student student = p.getStudent();
		
		student.disp();
	}
}
