package com.test.construct.filepath;

import java.io.File;

public class DeleteFileDemo {
	public static void main(String[] args) {
		
		
		// program is to delete the file 
		File myfile=new File("a1.txt"); 
		
		if(myfile.delete()) {
			System.out.println("delete the file succesfully "+myfile.getName());
		}else {
			
			System.out.println("failed to delete a file");
		}
	}

}
