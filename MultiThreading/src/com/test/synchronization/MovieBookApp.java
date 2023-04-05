package com.test.synchronization;

 
class BookTheaterTicket {
	int total_seats = 10;

	synchronized void  bookSeats(int seat) {// Synchronized method 

		if (total_seats >= seat) {

			System.out.println(seat + "  seat book successfully");
			total_seats = total_seats - seat;
			System.out.println("seats left : " + total_seats);

		} else {

			System.out.println("sorry can not book available");
			System.out.println("seats left : " + total_seats);
		}

	}

}

public class MovieBookApp extends Thread {

	int seat;
	static BookTheaterTicket b;

	public void run() {

		b.bookSeats(seat);

	}

	public static void main(String[] args) {

		b = new BookTheaterTicket();

		MovieBookApp pradeep = new MovieBookApp();// thread 1
		pradeep.seat = 7;
		pradeep.start();

		MovieBookApp amit = new MovieBookApp();// thread2
		amit.seat = 4;
		amit.start();
	}
}
