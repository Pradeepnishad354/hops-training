package com.test;

public class Singleton {
	
	public static Singleton instance=null;
	
	public String s;
	
	private Singleton() {
		
		
	}
	
	public static  Singleton getInstance() {
		
		if(instance==null) {
			
			instance=new Singleton();
				
		}
	
	return	instance;
	}
	
	
	public static void main(String[] args) {
		
		
		Singleton instance2 = Singleton.getInstance();
		Singleton instance3 = Singleton.getInstance();
		Singleton instance4 = Singleton.getInstance();
		
		System.out.println(instance2+" "+instance3+" "+instance4);
		
		if(instance2==instance3 && instance3==instance4) {
			
			
			System.out.println(" These are allocated same memory location ");
		}
		
	}
	
	

}
