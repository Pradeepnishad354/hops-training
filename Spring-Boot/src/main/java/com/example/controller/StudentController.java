package com.example.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Address;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller

public class StudentController {

	@GetMapping("/get/{id}")
	public String getData(@PathVariable String id ,@RequestParam("name") String name) {

		System.out.println(id);
System.out.println(name);
		return "pradeep" + id;

	}

//	@PostMapping("/post")
//	public Student postData(@RequestBody Student student) {
//
//		System.out.println(student);
//
//		return student;
//
//	}
	
	@PostMapping("/post")
	public String postData(@RequestBody Map<String, Object> map) {

		//System.out.println(map.get("name"));
		
		ObjectMapper   mapper=new ObjectMapper();
		Address value = mapper.convertValue(map.get("address"),Address.class);
		System.out.println(value);
		
		System.out.println(value.getCity());

		
		System.out.println(map.get("address"));

		return "student data";

	}
}
