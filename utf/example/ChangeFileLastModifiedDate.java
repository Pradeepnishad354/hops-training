package com.test.utf.example;

import java.io.File;
import java.util.Date;

public class ChangeFileLastModifiedDate {
	public static void main(String[] args) {

		File file = new File("b1.txt");

		   // Get the current last modified timestamp of the file
		Date lastModified = new Date(file.lastModified());
		System.out.println("current last modified" + lastModified);

		// Set the new last modified timestamp to now
		boolean success = file.setLastModified(System.currentTimeMillis());
		if (success) {

			System.out.println("last modified is update now");
		} else {

			System.out.println("failed to modified last modified timestamp");
		}

	}

}
