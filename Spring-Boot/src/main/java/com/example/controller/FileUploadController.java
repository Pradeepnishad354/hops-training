package com.example.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {
	
	@Autowired
	private FileUploadHepler fileUploadHepler;
	
	@PostMapping("/upload")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) throws IOException{
		
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getContentType());
		System.out.println(file.getSize());
		
		System.out.println(file.getName());
		
		System.out.println(file.getResource());
		
		if(file.isEmpty()) {
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("request must contain file ");
			
		}
		
		if(!file.getContentType().equals("image/jpeg")) {
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("only jpeg fomate is allowed ");
		}
		
		
		boolean uploadFile = fileUploadHepler.uploadFile(file);
		
		if(uploadFile) {
			
			return ResponseEntity.ok("file upload successfully");
		}
		
		
		return ResponseEntity.ok("working");
	}

}
