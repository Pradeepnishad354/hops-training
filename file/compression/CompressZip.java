package com.test.file.compression;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

// compress file into zip
public class CompressZip {
	
	public static void main(String[] args) throws IOException {
		
		
		try {
			FileInputStream fis=new FileInputStream("file3.txt");
			
			FileOutputStream fos=new FileOutputStream("demo");
			
			DeflaterOutputStream df= new DeflaterOutputStream(fos);
			
			int data;
			
			try {
				while((data=fis.read())!=-1) {
					
					df.write(data);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			fis.close();
			df.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("success");
	}

}
