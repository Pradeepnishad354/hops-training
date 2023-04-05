package com.test.fileserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileSerializableEx {
	public static void main(String[] args) throws IOException {

		//single object serialize
		Book b = new Book(100, "java");
		
		Book b1 = new Book(104, "Spring");
		Book b2 = new Book(104, "hibernate");
		
		// multiple object serialize
		ArrayList<Book> a = new ArrayList<>();
		a.add(b);
		a.add(b1);
		a.add(b2);
		try {
			FileOutputStream fos = new FileOutputStream("p.txt");

			// object output streams
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(a);

			
			oos.close();
			
			System.out.println("task completed");
		} catch (FileNotFoundException e) {
			System.out.println(e);

		}
	}
}