package com.test.file;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;

//
public class FileModifiedDate {
	public static void main(String[] args) throws Exception {
		
		BasicFileAttributes attr;
		Path p = Paths.get("java1.txt");
		
		
		
		//get file size
		long bytes = Files.size(p);
		System.out.println("bytes"+bytes);
		
		BasicFileAttributes b=Files.readAttributes(p, BasicFileAttributes.class);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println(simpleDateFormat.format(b.lastAccessTime().toMillis()));
		
		//get file creation date.	
		System.out.println(simpleDateFormat.format(b.creationTime().toMillis()));
		
		//get last file modified time 
		System.out.println("last modified date "+simpleDateFormat.format(b.lastModifiedTime().toMillis()));
		
	
		
		// file is hidden or not 
		File file=new File("java1.txt");
		if(file.isHidden()) {
			
			System.out.println("the specified file is hidden");
		}else {
			
			System.out.println("the specified file is not hidden");
		}
		// java get  file path 
		
		System.out.println("path : "+file.getAbsolutePath());

	}

}
