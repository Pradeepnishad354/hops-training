package com.test.file;

import java.io.File;
import java.io.IOException;

public class FileCreate {
	public static void main(String[] args) throws IOException {
		
		
//		File f= new File("abc.txt");
		File f= new File("abcd.txt");
		
		System.out.println(f.exists());// return false because file is not available 
		
		
//		f.createNewFile();// new physical file is created 
		
		f.mkdir();
		System.out.println(f.exists());// true
		
		
	}

}
