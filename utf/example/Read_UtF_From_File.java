package com.test.utf.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

// read utf data from file 
public class Read_UtF_From_File {
	
	public static void main(String[] args) {
		
		
		File file = new File("file1.txt");

		try {BufferedReader read = new BufferedReader(
				new InputStreamReader(new FileInputStream(file), "UTF8")); 
		  String str;

		  while ((str = read.readLine()) != null) {
		    System.out.println(str);
		  }

		} catch (Exception e) {
		  System.out.println(e.getMessage());
		}
		
		
		
	}
}
	


