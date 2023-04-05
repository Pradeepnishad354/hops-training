package com.test.buffredwriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedWriterDemo {
	
	public static void main(String[] args) throws IOException {
		
		
		
		// read the data line by line from file 
		FileReader fr=new FileReader("a.txt");
		
		BufferedReader bf=new BufferedReader(fr);
		
		String s=bf.readLine();
		
		while(s !=null) {
			
			
			System.out.println(s);
			
		s = bf.readLine();
		}
		bf.close();
	}

}
