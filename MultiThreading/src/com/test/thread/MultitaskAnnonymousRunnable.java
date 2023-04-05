package com.test.thread;

//multitask by annonymous class that implement runnables
public class MultitaskAnnonymousRunnable {
	public static void main(String[] args) {

		// annonymous class that implement runnables
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 10; i++) {

					System.out.println(i);
					System.out.println("task 1 " + Thread.currentThread().getName());
				}

			}
		};

		Runnable r2 = new Runnable() {

			@Override
			public void run() {

				int a;
				a = 10 + 90;

				System.out.println("task 2  " + a + Thread.currentThread().getName());

			}
		};

		Thread t1 = new Thread(r1);
		t1.start();

		Thread t2 = new Thread(r2);
		t2.start();
	}

}
