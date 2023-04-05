package com.test.jackson;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonStringToMap {
	public static void main(String[] args) {
		
		
	ObjectMapper mapper = new ObjectMapper();
	
	String json="{\"name\":\"pradeep\",\"age\" : 22}";
	
	try {
		//convert json String to map
		Map map = mapper.readValue(json, Map.class);
		System.out.println(map);
		
		json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
		
		System.out.println(json);//pretty- print 
	} catch (JsonMappingException e) {
		
		e.printStackTrace();
	} catch (JsonProcessingException e) {
		
		e.printStackTrace();
	}
	}

}
