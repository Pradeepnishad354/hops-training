package com.test.thread.deadlock;

public class B {
public synchronized void d1(A a) {
		
		System.out.println("threads2 starts execution of d1() method");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Thread 2 trying to call A last() method");
		
		a.last();
	}

public synchronized void last() {
	
	System.out.println("Inside b's last method");
}

}
