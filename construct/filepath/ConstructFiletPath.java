package com.test.construct.filepath;

import java.io.File;
import java.io.IOException;

public class ConstructFiletPath {
	public static void main(String[] args) {

		//how to construct file path
		String filename = "sample.txt";
		String directory = System.getProperty("user.dir");
		String path = "";
		path = directory + File.separator + filename;

		System.out.println("filepath is -" + path);

		File files = new File(path);
		try {
			if (files.createNewFile()) {

				System.out.println("new file is created under the user path");
			} else {
				System.out.println("the file is already exists");
			}
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
