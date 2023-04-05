package com.jackson.annotation;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//@JsonAnyGetter allows a getter method to return Map which is then used to serialize the additional properties of 
//JSON in the similar fashion as other properties.

//@JsonGetter allows a specific method to be marked as getter method.

//@JsonSetter allows a specific method to be marked as setter method.
public class JsonAnyGetterAnno {
	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper mapper=new ObjectMapper();
		
		Student5 st=new Student5();
		st.add("name", "pradeep");
		st.add("age", "22");
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(st);
		
		System.out.println(json);
	}

}

	
	class Student5 {
		   private Map<String, String> properties;
		   public Student5(){
		      properties = new HashMap<>();
		   }
		   @JsonAnyGetter
		   public Map<String, String> getProperties(){
		      return properties;
		   }
		   public void add(String property, String value){
		      properties.put(property, value);
		   }
		}
