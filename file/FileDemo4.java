package com.test.file;

import java.io.File;

// to display file name only not directory
public class FileDemo4 {
	public static void main(String[] args) {

		int count = 0;

		File f = new File("C:\\users");

		String s1[] = f.list();

		for (String s2 : s1) {

			File f1 = new File("c:\\users");

			if (f1.isFile()) {

				count++;
				System.out.println(s2);

			}
//			if (f1.isDirectory()) {// to display directory  name only 
//
//				count++;
//				System.out.println(s2);
//
//			}
		}
		System.out.println(count);
	}
}
