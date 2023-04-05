package com.test.utf.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Write_UTFInto_File {

	public static void main(String[] args) throws IOException {

		File f = new File("file1.txt");

		Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f), StandardCharsets.UTF_8));

		out.append("learnJava")
		.append("\r\n").append("Utf-8 demo")
		.append("\r\n").
		append("हर हर महादेव")
		.append("\r\n")
				.append("તમે કેમ છો");

		out.flush();
		out.close();

		System.out.println("success");
	}

}
