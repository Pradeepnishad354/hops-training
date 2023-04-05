package com.test.directory;

import java.io.File;

public class DirDemo {

	public static void main(String[] args) {

		File file = new File("c:\\pradeep\\dir3");
		// multiple directory created
//		if (file.mkdirs()) {
//			System.out.println("directory created successfully");
//		} else {
//
//			System.out.println("failed to create directory");
//		}

		//// Delete the contents of the directory

//		File[] listFiles = file.listFiles();
//
//		for (File list : listFiles) {
//			list.delete();
//		}

		// delete the directory
		if (file.delete()) {

			System.out.println("directory delete succesfully");
		} else {

			System.out.println("failed to delete");
		}

	}

}
