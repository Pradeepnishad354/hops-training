package com.test.synchronization;

// using synchronization block

class BookTheaterTicket1 {
	int total_seats = 10;

	void bookSeats(int seat) {// Synchronized method

		System.out.println("hello" + Thread.currentThread().getName());
		System.out.println("hello" + Thread.currentThread().getName());
		System.out.println("hello" + Thread.currentThread().getName());
		synchronized (this) {

			if (total_seats >= seat) {

				System.out.println(seat + "  seat book successfully");
				total_seats = total_seats - seat;
				System.out.println("seats left : " + total_seats);

			} else {

				System.out.println("sorry can not book available");
				System.out.println("seats left : " + total_seats);
			}

		}

		System.out.println("hello" + Thread.currentThread().getName());
		System.out.println("hello" + Thread.currentThread().getName());
		System.out.println("hello" + Thread.currentThread().getName());
		System.out.println("hello" + Thread.currentThread().getName());
		System.out.println("hello" + Thread.currentThread().getName());

	}

}

public class MovieBookApp1 extends Thread {

	int seat;
	static BookTheaterTicket1 b;

	public void run() {

		b.bookSeats(seat);

	}

	public static void main(String[] args) {

		b = new BookTheaterTicket1();

		MovieBookApp1 pradeep = new MovieBookApp1();// thread 1
		pradeep.seat = 7;
		pradeep.start();

		MovieBookApp1 amit = new MovieBookApp1();// thread2
		amit.seat = 4;
		amit.start();
	}
}
