package com.test.utf.example;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Assign_File_Content_Into_Variable {
	
	
	public static void main(String[] args) {
		
		
		try {
			
			//read primitive datatypes 
			DataInputStream dis=new DataInputStream(new FileInputStream("file1.txt"));
			
			byte[] datainByte=new byte[dis.available()];
			
			dis.readFully(datainByte);
			dis.close();
			
			//store the data 
			String content = new String(datainByte,0,datainByte.length);
			
			System.out.println(content);
			
			System.out.println("SUCCESS");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
