package com.test.thread;

public class ThreadPriorityDemo extends Thread {

	public void run() {

		System.out.println("child thread");
		System.out.println("child thread "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {

		System.out.println("main thread priority by default is  " + Thread.currentThread().getPriority());
//Thread.currentThread().setPriority(10);

Thread.currentThread().setPriority( MAX_PRIORITY);

System.out.println("main thread new priority :"+Thread.currentThread().getPriority());
		ThreadPriorityDemo t = new ThreadPriorityDemo();
		
		t.setPriority(3);
		t.start();
	}
}
