package com.test.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
	public static void main(String[] args) throws IOException {

//		FileWriter fw = new FileWriter("abc.txt");// file writing using filewriter with overriding
		
		FileWriter fw = new FileWriter("abc.txt",true);// append method used then data printed all time  

		fw.write(100);// adding a single character
		fw.write("deep\n learn code ");

		char ch[] = { 'a', 'b', 'c', 'd' };// adding array of character 
		fw.write(ch);
		fw.write('\n');
		fw.flush();
		fw.close();

	}

}
