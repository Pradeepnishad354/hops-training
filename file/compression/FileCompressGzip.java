package com.test.file.compression;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;


//using GZIPOutputStream class
public class FileCompressGzip {
	
//static final String OUTPUT_FILE="C:\\pradeep\\a2.gz";
//static final String INPUT_FILE="C:\\pradeep\\a1.txt";




static void compress() {
	
	
	byte[] b=new byte[1024];
	
	try {
		GZIPOutputStream go=new  GZIPOutputStream(new FileOutputStream("f.gz"));
		
		FileInputStream fis = new FileInputStream("file1.txt");
		
		int totalSize;
		
		while((totalSize=fis.read(b))>0) {
			
			go.write(b,0,totalSize);
		}
		
		fis.close();
		go.close();
		
		
		System.out.println("file compressed successfully");
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
}

	public static void main(String[] args) {
		
		compress();
		
		
		
	}

}
