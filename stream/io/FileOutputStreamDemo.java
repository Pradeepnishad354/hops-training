package com.test.stream.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {

		// write the binary data (byte) into the file
		File f = new File("input.txt");

		f.createNewFile();

		System.out.println(f.exists());

		// write the text into the above created file using fileoutputStream
		FileOutputStream fs = new FileOutputStream(f);
		String s = "my name is pradeep";
		fs.write(s.getBytes());

		fs.flush();
		fs.close();
		System.out.println("success");
		
		
	}

}
