package com.jackson.annotation;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//@JsonRawValue allows to serialize a text without escaping or without any decoration.

//@JsonView is used to control values to be serialized or not.
public class JsonRawAnno {
	public static void main(String[] args) throws JsonProcessingException {
		
		Student6 st=new Student6(1,"amit","{\"attr\":false}");
		
		ObjectMapper mapper=new ObjectMapper();
	String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(st);
		
		
		System.out.println(json);
		
		
		
	}

}

class Student6{
	
	@JsonView(Views.Public.class)
	public  int id;
	@JsonView(Views.Public.class)
	public  String name;
	
	@JsonView(Views.Public.class)
	@JsonRawValue
	public String json;

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

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	public Student6(int id, String name, String json) {
		super();
		this.id = id;
		this.name = name;
		this.json = json;
	}
	
	
	
	
}

class Views{
	
	static class Public{}
	static class Internal extends Public{}
}

