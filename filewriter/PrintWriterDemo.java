package com.test.filewriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
	    //Data to write on Console using PrintWriter  
		
		PrintWriter pr=new  PrintWriter(System.out);
		
		pr.write("har har mahadaev");
		pr.flush();
		pr.close();
		
		
		//Data to write in File using PrintWriter       
		PrintWriter wr=null;
		
		wr=new PrintWriter(new File("abc.txt"));
		wr.write("spring ,spring boot , microservices");
		
		wr.flush();
		wr.close();
		
	}
}
