package com.test.file.delete.with.extension;

import java.io.File;
import java.io.FilenameFilter;

public class ExtensionFilter implements  FilenameFilter {

	
	private String fileExtesion;
	
	public ExtensionFilter(String fileExtesnion) {
		
		this.fileExtesion=fileExtesnion;
	}
	
	
	// dir-the directory in which file is found
	//name-the name of the file 
	@Override
	public boolean accept( File dir,  String name) {
		
		return (name.endsWith(fileExtesion));
	}
	
	

}
