package com.test.file.delete.with.extension;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {

		FileDemo fileDemo = new FileDemo();
		fileDemo.deleteFile("C:\\pradeep",".txt");
	}

	
	
	public void deleteFile(String dirName, String fileExtension) {
		File fileDir = new File(dirName);

		ExtensionFilter extensionFilter = new ExtensionFilter(fileExtension);

		// return an array of string 
		String[] listofFileNames = fileDir.list(extensionFilter);

		if (listofFileNames.length == 0) {

			System.out.println("no of files ends with " + fileExtension);
		}

		
		
		// for each loop
		for (String fileName : listofFileNames) {
			
			// find all the filename 
			System.out.println("file name"+fileName);

//			String filePath = new StringBuilder(dirName).append(File.separator).append(fileName).toString();
//
//			File file = new File(filePath);
//			boolean isDelete = file.delete();
//
//			System.out.println(file.getAbsolutePath() + " " + " isDelete" + isDelete);
		}

	}
}
