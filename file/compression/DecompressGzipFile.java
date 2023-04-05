package com.test.file.compression;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPInputStream;

//Decompressing a File using Gzipinputstream
public class DecompressGzipFile {

	//static final String OUTPUT_FILE = "C:\\pradeep\\f.gz";
	//static final String INPUT_FILE = "C:\\pradeep\\a1.txt";

	static void decompress() {

		byte[] b = new byte[1024];

		try {

			// take compress file
			GZIPInputStream gi = new GZIPInputStream(new FileInputStream("f.gz"));

			// decompress file name
			FileOutputStream out = new FileOutputStream("decompress.txt");

			int totalSize;

			while ((totalSize = gi.read(b)) > 0) {
				out.write(b, 0, totalSize);// write(): Writes a byte of data, Present in FileOutputStream.

				out.close();
				gi.close();
				System.out.println("decompressed succesfully ");

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		decompress();

	}

}
