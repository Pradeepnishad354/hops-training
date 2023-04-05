package com.test.utf.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountNumberOfLinesInFile {
	public static void main(String[] args) {
		int count = 0;

		// create a new file object
		File file = new File("file1.txt");

		try {
			
			// create an object of Scanner
		      // associated with the file
			Scanner sc = new Scanner(file);

			// read each line and
		      // count number of lines
			
			while (sc.hasNextLine()) {
				sc.nextLine();

				count++;
			}
			System.out.println("total number of lines in file " + count);

			sc.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
