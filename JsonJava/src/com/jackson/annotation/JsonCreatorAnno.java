package com.jackson.annotation;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

/*@JsonCreator- is used to fine tune the constructor or factory method used in 
deserialization. We'll be using @JsonProperty as well to achieve the same.
In the example below, we are matching an json with different
format to our class by defining the required property names.
*/

public class JsonCreatorAnno {
	public static void main(String[] args) {
		String json = "{\"id\":1,\"theName\":\"Mark\"}";
		ObjectMapper mapper = new ObjectMapper();
		try {
			Student10 student = mapper.readerFor(Student10.class).readValue(json);
			System.out.println(student.rollNo + ", " + student.name);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

class Student10 {
	public String name;
	public int rollNo;

	@JsonCreator
	public Student10(@JsonProperty("theName") String name, @JsonProperty("id") int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
}