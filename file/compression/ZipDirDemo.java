package com.test.file.compression;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipDirDemo {

	private ArrayList<String> fileList;

	private static final String OUTPUT_ZIP_FILE = "JavaCollections.zip";
	private static final String SOURCE_FOLDER = "JavaCollections";

	public ZipDirDemo() {

		fileList = new ArrayList<>();

	}

	public void zipIt(String zipFile) {

		byte[] buffer = new byte[1024];
		try {
			FileOutputStream fos = new FileOutputStream(zipFile);

			ZipOutputStream zos = new ZipOutputStream(fos);

			System.out.println("output to zip " + zipFile);

			for (String file : this.fileList) {

				System.out.println("File added" + file);
				ZipEntry ze = new ZipEntry(zipFile);
				zos.putNextEntry(ze);

				FileInputStream in = new FileInputStream(SOURCE_FOLDER + File.separator + file);

				int len;

				while ((len = in.read(buffer)) > 0) {

					zos.write(buffer, 0, len);
				}
				in.close();

			}
			zos.closeEntry();
			System.out.println("zip file is created ");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

//	 treverse a directory and get allfiles and add the 
//	 file into filelist
	public void generateFileList(File node) {

		// add file only

		if (node.isFile()) {

			// fileList.add()
		}
		if (node.isDirectory()) {

			String[] subNote = node.list();

			for (String filename : subNote) {

				generateFileList(new File(node, filename));
			}
		}

	}

	private String generateZipEntry(String file) {

		return file.substring(SOURCE_FOLDER.length() + 1, file.length());

	}
	
	public static void main(String[] args) {
		
		ZipDirDemo zipDemo = new ZipDirDemo();
		
		zipDemo.generateFileList(new File(SOURCE_FOLDER));
		zipDemo.zipIt(OUTPUT_ZIP_FILE);
		
	}

}
