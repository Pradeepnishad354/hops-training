package com.test.thread;

public class JoinMethodDemo2 extends Thread {

	static Thread mainThread;

	public void run() {

		try {
			mainThread.join();//first execute main thread and after that join the child thread 

			for (int i = 1; i <= 5; i++) {
				System.out.println("child thread" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);

		}
	}

	public static void main(String[] args) {

		JoinMethodDemo2 j = new JoinMethodDemo2();
		j.start();

		mainThread = new Thread().currentThread();

		try {
			for (int i = 1; i <= 5; i++) {

				System.out.println("main thread" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {

		}
	}

}
