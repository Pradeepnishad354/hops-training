package com.jackson.annotation;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.ObjectMapper;

//@JsonSetter allows a specific method to be marked as setter method.

//@JsonValue allows to serialize an entire object using its single method.
public class JsonSetterAnno {
	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "{\"rollNo\":1,\"name\":\"pradeep\"}";
		
		

		try {
			Student7 student = mapper.readerFor(Student7.class).readValue(jsonString);
			
	// Json value example		
			
//			Student7 st=new Student7(123,"amit");
//			String json = mapper.writeValueAsString(st);
//			System.out.println(json);
			
			System.out.println(student.name);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

class Student7 {

	public int rollNo;
	public String name;

	@JsonSetter("name")
	public void setTheName(String name) {
		this.name = name;
	}
	
//	public Student7(int rollNo, String name) {
//		super();
//		this.rollNo = rollNo;
//		this.name = name;
//	}

//	@JsonValue
//	public String  toString() {
//		
//		return "{name: "+name+"}";
//		
//	}
}