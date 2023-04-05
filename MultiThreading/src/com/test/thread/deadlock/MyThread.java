package com.test.thread.deadlock;

public class MyThread extends Thread {

	A a = new A();

	B b = new B();
	
	
	public void m1() {
		this.start();
		a.d1(b); // this line will be executed my main thread

	}

	public void run() {
		
		b.d1(a);// this line will be executed by child thread

	}

	

	public static void main(String[] args) {

		MyThread t = new MyThread();
		t.m1();
	}

}
