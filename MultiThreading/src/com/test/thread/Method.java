package com.test.thread;

//setName(),getName(),currentThread(),isAlive
public class Method {
	public static void main(String[] args) {
		
		System.out.println("hello");
		
	//	System.out.println(Thread.currentThread().getName());//
		Thread.currentThread().setName("pradeep");
		System.out.println("new thread name:+  "+Thread.currentThread().getName());
		System.out.println(10/0);// exception in pradeep thread
		
	}

}
