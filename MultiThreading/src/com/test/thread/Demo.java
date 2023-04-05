package com.test.thread;

// set and get thread name
public class Demo extends Thread {

	public void run() {
		//System.out.println(Thread.currentThread().getName());// thread-0 it provide by JVM
		System.out.println("task thread ");
	//Thread.currentThread().setName("a");
	System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		Demo d = new Demo();
//		d.setName("pradeep");
		d.start();
		Demo d1 = new Demo();
//		d1.setName("mahadev");
		d1.start();
		System.out.println("thread d1 -"+d.isAlive());// true 
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());// true
		
		System.out.println("thread d -"+d.isAlive());// true is in executing state 
	}

}
