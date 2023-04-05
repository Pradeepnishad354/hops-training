package com.test.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

// file copy
public class FileCopy {
	public static void main(String[] args) {
		
		File sourceFile=new File("abc.txt");
		
		File destinationFile=new File("j.txt");
		
		try {
			Files.copy(sourceFile.toPath(),destinationFile.toPath());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("success");
		
	}

}
