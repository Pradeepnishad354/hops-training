package com.test.fileserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializationEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("p.txt"));

			//single object read
			//Book b1 = (Book)ois.readObject();
			
			// multiple object read
			
		ArrayList<Book> arrayList = new ArrayList<>();
		 arrayList = (ArrayList<Book>) ois.readObject();
		 
		 for(Book b: arrayList)
			 System.out.println(b);

			//System.out.println("book code" + b1.bookCode);
			//System.out.println("book name" + b1.bookName);
			ois.close();

		

	}
}