package com.jackson.annotation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPropertyAnno {
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		
		ObjectMapper mapper=new ObjectMapper();
		
		String json= "{\"name\":\"Sharon\",\"id\":101, \"course\":\"MCA\"}";
		
		// de serialize  json into java object
	Student st=	mapper.readerFor(Student.class).readValue(json);
	System.out.println(st.getId());
	System.out.println(st.getName());
	System.out.println(st.getCourse());
	
		
		
	}

}
class Student{
	
	private int id;
	
	private String name;
	
	private String course;
	@JsonProperty("")
	public int getId() {
		return id;
	}
	@JsonProperty("id")
	public void setId(int id) {
		this.id = id;
	}
	@JsonProperty("name")
	public String getName() {
		return name;
	}
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("course")
	public String getCourse() {
		return course;
	}

	@JsonProperty("course")
	public void setCourse(String course) {
		this.course = course;
	}

	public Student(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public Student() {
		super();
		
	}
	
	
}