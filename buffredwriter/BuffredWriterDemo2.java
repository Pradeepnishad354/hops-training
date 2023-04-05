package com.test.buffredwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BuffredWriterDemo2 {
	public static void main(String[] args) throws IOException {

		// write the data into file character by character
		File f = new File("a.txt");
	System.out.println(f.exists());	
		f.createNewFile();
		
		FileWriter fw=new FileWriter("a.txt");
		
		BufferedWriter bf= new BufferedWriter(fw);
		
		bf.write(100);
		bf.newLine();
		char[] ch= {'c','d','e'};
		bf.write(ch);
		bf.newLine();
		bf.write("java is  a programming language ");
		bf.newLine();
		
		bf.flush();
		bf.close();
System.out.println("done");
	}

}
