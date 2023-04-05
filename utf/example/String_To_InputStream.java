package com.test.utf.example;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class String_To_InputStream {
	public static void main(String[] args) throws IOException {
		
		
		String string=" har har mahadev";
		
		InputStream stream = new ByteArrayInputStream(string.getBytes());
		System.out.println(stream.available());
		stream.read();
		stream.read();
		
		System.out.println("the number of byte available at the end "+stream.available());
		
		stream.close();
		
		
		
	}

}
