package com.test.construct.filepath;

import java.io.File;

public class FilePermissionDemo {
	public static void main(String[] args) {
		
		
		File file=new File("java1.txt");
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		//
		file.setWritable(false);
		System.out.println(file.canWrite());
		
		
		System.out.println(file.canExecute());
//		System.out.println(file.delete());
		
		//setting the write permission false 
//		
//		file.setWritable(false);
//		
//		System.out.println(file.canWrite());
//		
//		
	}

}
