package com.test.utf.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//convert array  bytes into File.
public class ByteFile {

	// Path of a file
	static String FilePath = "file2.txt";

	static File file = new File(FilePath);

	static void writeByte(byte[] bytes) {

		try {
			OutputStream os = new FileOutputStream(file);
			
			 // Starting writing the bytes in it
			os.write(bytes);

			System.out.println("successfully byte inserted");

			os.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		String string = "java t point " + "har har mahadev";

		//// Getting byte array from string
		// using getBytes() method
		byte[] bytes = string.getBytes();

		// convert byte array to file
		writeByte(bytes);
	}

}
