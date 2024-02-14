package com.test.stream;

public class Singleton {
	
	public static Singleton instance=null;
	
	
	
	
	
	
	
	public static Singleton getInstance() {
		
		if(instance==null) {
			
			instance=new Singleton();
		}
		
		return instance;
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		Singleton instance2 = getInstance();
		Singleton instance3 = getInstance();
		Singleton instance4 = getInstance();
		
		
		
		if (instance2==instance3 && instance3== instance4) {
			
			System.out.println("they are indicating same memory location ");
		}
		
	}

}
