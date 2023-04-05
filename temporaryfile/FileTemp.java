package com.test.temporaryfile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTemp {
	
	public static void main(String[] args)  {
		
		String prefix="abcde";
		String suffix=".txt";
		
		try {
			// create temp file 
			File tempFile=File.createTempFile(prefix, suffix);
			
			
			
			// write into temp file 
			FileOutputStream out=new FileOutputStream(tempFile);
			
			out.write("har har mahadev".getBytes());
			out.close();
			
			// get absolute path of the temp file 
			String absolutePath = tempFile.getAbsolutePath();
			System.out.println(absolutePath);
			System.out.println("success");
			
			if(tempFile.delete()) {
				
				System.out.println("file delete succesfully");
			}else {
				
				System.out.println("file failed ");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	}

}
