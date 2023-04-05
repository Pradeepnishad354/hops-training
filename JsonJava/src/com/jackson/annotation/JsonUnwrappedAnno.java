package com.jackson.annotation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


//@JsonUnwrapped is used to unwrap values of objects during serialization or de-serialization.

//@JsonRootName allows to have a root node specified over the JSON. We need to enable wrap root value as well.
public class JsonUnwrappedAnno {

	public static void main(String[] args) throws ParseException, JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();
		
		//jsonrootName
		mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = simpleDateFormat.parse("20-12-1984");

		Student8.Name name = new Student8.Name();
		name.first = "Jane";
		name.last = "Doe";

		Student8 student = new Student8(1, name);
		String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
		System.out.println(jsonString);

	}
}

@JsonRootName(value="student")
class Student8 {
	public int id;
	@JsonUnwrapped
	public Name name;

	Student8(int id, Name name) {
		this.id = id;
		this.name = name;
	}

	static class Name {
		public String first;
		public String last;
	}
}