package com.jackson.annotation;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;

//@JacksonInject is used when a property value is to be injected instead of being parsed from Json input. 
//In the example below, we are inserting a value into object instead of parsing from the Json.

//deserialization 
public class JsonInjectAnno {

	public static void main(String[] args) {

		String json = "{\"name\":\"pradeep\"}";

		InjectableValues injectableValues = new InjectableValues.Std().addValue(int.class, 1);

		ObjectMapper mapper = new ObjectMapper();

		try {
			Student14 student = mapper.reader(injectableValues).forType(Student14.class).readValue(json);
			System.out.println(student.rollNo + ", " + student.name);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

class Student14 {
	public String name;
	
	@JacksonInject
	public int rollNo;
}