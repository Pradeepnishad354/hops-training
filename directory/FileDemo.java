package com.test.directory;

import java.io.File;

//Copy directory
public class FileDemo {

	public static void main(String[] args) {

		File srcDir = new File("c:\\pradeep");
		File desDir = new File("c:\\Inetl");

		if (!srcDir.exists()) {

			System.out.println("directory does not exists");
		} else {

			FileDemo fileDemo = new FileDemo();
			fileDemo.copyDir(srcDir, desDir);
			System.out.println("copied successfully");

		}
	}

	public void copyDir(File src, File dest) {
		if (src.isDirectory()) {

			//if directory is not exits create it 
			if (!dest.exists()) {
				dest.mkdir();

				System.out.println("directory copies from " + src + " to" + dest);

			}
			//list all the directory  contents 
			String files[] = src.list();
			for (String fileName : files) {

				//construct the src and dest
				File srcFile = new File(src, fileName);
				File desFile = new File(dest, fileName);

				//recursive copy 
				copyDir(srcFile, desFile);
			}
		}

	}

}
