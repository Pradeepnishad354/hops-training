package com.test.buffredwriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	// printwriter can be write any primitive data type into the file  
	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter pr = new PrintWriter("a.txt");

		pr.print(100);
		pr.println(100);

		pr.print("mahadev");

		pr.println(10.5);
		pr.print(true);

		pr.println(10.4f);
		pr.flush();
		pr.close();
	}


}
