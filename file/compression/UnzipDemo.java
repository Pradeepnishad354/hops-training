package com.test.file.compression;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.InflaterInputStream;

//Uncompressing a file using an InflaterInputStream
public class UnzipDemo {
	
	public static void main(String[] args) {
		
		
		
	try {
		 //assign Input File : file2 to FileInputStream for reading data
		FileInputStream fis=	new FileInputStream("file2");
		
		 //assign output file: file3 to FileOutputStream for reading the data
		FileOutputStream fos=new FileOutputStream("amit");
		
		 //assign inflaterInputStream to FileInputStream for uncompressing the data
	InflaterInputStream iis=	new InflaterInputStream(fis);
	
	int data;
	
	while((data=iis.read()) !=-1) {
		
		fos.write(data);
	}
		
		//close the files 
		fos.close();
		iis.close();
	} catch (Exception  e) {
		
		e.printStackTrace();
	}
		
	System.out.println("success");
		
	}

}
