package com.test.thread;

public class Test1 implements Runnable {

	@Override
	public void run() {
		System.out.println("task is started ");
	}

	public void run(int a, int b) {

		int result;

		result = a + b;
		System.out.println(result);

	}
	public void start() {
		
		System.out.println("start");
	}

	public static void main(String[] args) {

		Test1 t = new Test1();

		Thread t1 = new Thread(t);// create thread class object then pass the parameter of the test class
		t1.start();
		t.run(12,14);
		t.start();

	}

}
