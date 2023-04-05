package com.test.stream.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) {

		// reading the text from fileInputStream
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("input.txt");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

		int i = 0;
		try {
			i = fi.read();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		while (i != -1) {

			char ch = (char) i;
			System.out.print(ch);

			try {
				i = fi.read();// read the next character

			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
