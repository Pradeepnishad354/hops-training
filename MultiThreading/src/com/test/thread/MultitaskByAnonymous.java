package com.test.thread;

//multitask by annonymous class that extends thread class
public class MultitaskByAnonymous {

	public static void main(String[] args) {

		
		//annonymous class that extends the thread class 
		Thread t1 = new Thread() {

			public void run() {

				System.out.println("task 1 run by " + Thread.currentThread().getName());

			}
		};

		//annonymous class that extends the thread class 
		Thread t2 = new Thread() {

			public void run() {

				System.out.println("task 2 run by " + Thread.currentThread().getName());
			}

		};

		t1.start();
		t2.start();
	}

}
