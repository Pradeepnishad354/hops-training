package com.test.thread;

public class SleepThreadMethodDemo extends Thread {

	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				//Thread.sleep(1000);// its impelement anotherlanguage 
				Thread.sleep(1000, -1);// this is build by java 
				System.out.println(i);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		SleepThreadMethodDemo s = new SleepThreadMethodDemo();
		s.start();

	}

}
