package com.example.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadHepler {

	public final String UPLOAD_DIR = "C:\\Users\\PradeepNishad\\Downloads\\Spring Boot\\Spring-Boot\\src\\main\\resources\\static\\image";

	public boolean uploadFile(MultipartFile multipartFile) throws IOException {

		boolean f = false;

		// upload file

		InputStream is = multipartFile.getInputStream();

		byte data[] = new byte[is.available()];

		// write

		FileOutputStream fos = new FileOutputStream(UPLOAD_DIR + File.separator + multipartFile.getOriginalFilename());

		fos.write(data);
		fos.flush();
		fos.close();
		return f;
	}
}
