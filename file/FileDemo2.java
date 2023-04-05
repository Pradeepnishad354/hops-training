package com.test.file;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		
		
		
		File f=new File("C:\\pradeep","ab.txt");
		
		f.createNewFile();
		System.out.println(f.exists());
		
		
		
	}

}
