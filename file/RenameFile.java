package com.test.file;

import java.io.File;

// file rename
public class RenameFile {
	public static void main(String[] args) {
		
		File file=new File("java.txt");
		
		if(file.exists()) {
		
		boolean success = file.renameTo(new File("java1.txt"));
		System.out.println("success "+success);
		}
		else {
			System.out.println("file does not exist");
		}
	}

}
