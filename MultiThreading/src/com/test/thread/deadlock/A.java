package com.test.thread.deadlock;

public class A {
	
	public synchronized void d1(B b) {
		
		System.out.println("threads1 starts execution of d1() method");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Thread 1 trying to call B last() method");
		
		b.last();
	}
	
	public synchronized void last() {
		
		System.out.println("Inside a's last method");
	}

}
