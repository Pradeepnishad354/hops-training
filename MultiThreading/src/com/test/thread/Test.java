package com.test.thread;

// create thread using extends thread class 
// performing single task from single thread
//performing single task from multiple thread
//performing multiple task from single  thread **it is not possible 

public class Test extends Thread {

	@Override
	public void run() {

		System.out.println("task is started ");

	}
//	public void start() {
//		System.out.println("start");
//	}

	public static void main(String[] args) { // (main thread create by JVM)

		Test t = new Test();// thread 1
		t.start();

		Test t2 = new Test();// thread 2
		t2.start();

//		t.start();
		// t.start();// we can not call thread again
		// t.run();// thread will not created it will simple method
	}

}
