package com.jackson.annotation;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

//@JsonFilter is used to apply filter during serialization/de-serialization like which properties are to be used or not.

public class JsonFilterAnno {

	public static void main(String[] args) throws JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();
		Student13 student = new Student13(1, 13, "pradeep");

		FilterProvider filters = new SimpleFilterProvider().addFilter("nameFilter",
				SimpleBeanPropertyFilter.filterOutAllExcept("name"));

		String jsonString = mapper.writer(filters).withDefaultPrettyPrinter().writeValueAsString(student);
		System.out.println(jsonString);

	}

}

@JsonFilter("nameFilter")
class Student13 {
	public int id;
	public int rollNo;
	public String name;

	Student13(int id, int rollNo, String name) {
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
	}
}