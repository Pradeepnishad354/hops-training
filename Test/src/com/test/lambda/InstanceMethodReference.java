package com.test.lambda;

interface  Sayable{
	
	void say();
	
}


public class InstanceMethodReference {
	
	public void saySomething() {
		
		System.out.println("say something");
	}
	
	
	public static void main(String[] args) {
		
		InstanceMethodReference methodReference=new InstanceMethodReference();
		
		
		Sayable sayable=methodReference::saySomething;
		
		
		sayable.say();
		
		
		
		
	}

}
