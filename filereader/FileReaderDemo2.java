package com.test.filereader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
	public static void main(String[] args) throws IOException {
		
		
		File f=new File("abc.txt");// file name
		
		FileReader fr=new FileReader(f);// read the file
		
		char[] ch=new char[(int) f.length()];// type cast length long to int
		
		fr.read(ch);
		
		for(char ch1: ch) {
			
			System.out.print(ch1);
		}
		
		fr.close();
		
		
	}

}
