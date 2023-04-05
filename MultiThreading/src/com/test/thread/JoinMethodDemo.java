package com.test.thread;

public class JoinMethodDemo extends Thread {

	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {

				System.out.println("child thread " + " " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);

		}
	}

	public static void main(String[] args) throws InterruptedException {

		JoinMethodDemo j = new JoinMethodDemo();
		j.start();
		
		j.join();//first execute the child thread and after that the main thread will join to execute
		try {
			for (int i = 1; i <= 5; i++) {

				Thread.sleep(1000);

				System.out.println("main thread  " + i);
			}
		} catch (InterruptedException e) {
			System.out.println(e);

		}
	}
}
