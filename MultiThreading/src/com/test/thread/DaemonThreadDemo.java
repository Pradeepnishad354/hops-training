package com.test.thread;

public class DaemonThreadDemo extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread");
		} else {

			System.out.println("child thread");
		}

	}

	public static void main(String[] args) {

		 System.out.println("main Thread");// when main thread is performing some
		// task then daemon thread is work
		
	//	Thread.currentThread().setDaemon(true); // it give exception because we can not set daemon thread of main thread
		DaemonThreadDemo d = new DaemonThreadDemo();
		// d.start(); it will give the exception IllegalThreadexception
		d.setDaemon(true);
		d.start();
	}
}
