package com.test.file;

import java.io.File;

public class FileDemo3 {

	/// check all file list of a directory
	public static void main(String[] args) {

		int count=0;
		File f = new File("C:\\users");

		String[] s = f.list();
		for (String s1 : s) {
			
			count++;

			System.out.println(s1);
		}
		
		System.out.println("the total number of file "+count);
	}

}
