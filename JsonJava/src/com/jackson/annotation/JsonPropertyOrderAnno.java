package com.jackson.annotation;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//serialization
public class JsonPropertyOrderAnno {
	public static void main(String[] args) throws JsonProcessingException {
		
		Student3 st=new Student3(122,"pradeep");
		
		ObjectMapper mapper=new ObjectMapper();
	   System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(st));;
		
		
	}

}
@JsonPropertyOrder({"name","id"})
class Student3 {
	
	int id;
	String name;
	 Student3(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}