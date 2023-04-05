package com.springmvc;

import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import jakarta.servlet.http.HttpSession;

@Controller
public class FileUploadController {

	@RequestMapping("/upload")
	public String showFile() {

		return "file";
	}
	
	
	@RequestMapping(value="/processProfile" ,method = RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file ,HttpSession session) {
		
		System.out.println("file upload handler");
		
		System.out.println(file.getContentType());
		System.out.println(file.getSize());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getName());
		byte[] bytes = file.getBytes();
		
		// we save this on the server 
		
		
		
		//FileOutputStream out=new FileOutputStream(file);
		
		//out.write(bytes);
		
		return "success";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

//	@RequestMapping(path="/processProfile", method = RequestMethod.POST)
//	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file, HttpSession session) {
//
//		System.out.println("file uploader");
//
//		System.out.println(file.getSize());
//
//		System.out.println(file.getContentType());
//		System.out.println(file.getName());
//
//		System.out.println(file.getOriginalFilename());
//		System.out.println(file.getStorageDescription());

		// get the byte data
//		byte[] data = file.getBytes();
//
//		// we have to save the file to server
//
//		String path = session.getServletContext().getRealPath("/") + file.getOriginalFilename();
//		System.out.println(path);
//		try {
//			FileOutputStream os = new FileOutputStream(path);
//			os.write(data);
//			os.close();
//			System.out.println("file uploaded successully");
//		} catch (Exception e) {
//
//		}
//		return "success";
//	}
//}
