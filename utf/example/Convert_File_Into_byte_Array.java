package com.test.utf.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

// convert file into byte array
public class Convert_File_Into_byte_Array {

	public static void main(String[] args) throws IOException {

		// Creating an object of Path class and
		// assigning local directory path of file to it
		Path path = Paths.get("file2.txt");

		// Converting the file into a byte array
		// using Files.readAllBytes() method
		byte[] arr = Files.readAllBytes(path);

		// Printing the above byte array
		System.out.println(Arrays.toString(arr));
	}

}
