package com.test.construct.filepath;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppendDemo {
	public static void main(String[] args) {

		String s = "mahadev";

		try {
			FileWriter f = new FileWriter("a.txt", true);

			f.write(s);
			System.out.println("data append succesfully");
			f.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
