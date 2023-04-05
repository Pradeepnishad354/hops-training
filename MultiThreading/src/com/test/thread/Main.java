package com.test.thread;
//case4

//performing multiple  task from multiple thread

class MyThread extends Thread {

	public void run() {
		for(int i=0; i<=4; i++)
		System.out.println("video playing ");
	}
}

class MyThread2 extends Thread {

	public void run() {
for(int i=0; i<4; i++)
		System.out.println("music playing");
	}
}

public class Main {
	public static void main(String[] args) {

		MyThread th = new MyThread();
		MyThread t = new MyThread();
		t.start();
		th.start();

		MyThread2 th2 = new MyThread2();
		MyThread2 th3 = new MyThread2();
		th2.start();
		th3.start();

	}
}
