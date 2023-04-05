package com.test.method.reference;

import java.time.LocalDate;

public class Stuff {

	public static void doStuff() {

		System.out.println(" i am doing task ");

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.toString());
	}

	public static void doThread() {

		for (int i = 1; i < 10; i++) {

			System.out.println(i * 2);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	public  void printNumber() {

		for (int i = 1; i < 10; i++) {

			System.out.println(i);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
