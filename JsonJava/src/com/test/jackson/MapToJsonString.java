package com.test.jackson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MapToJsonString {
	public static void main(String[] args) {
		
		//JSONObject jo=new JSONObject();
		
		ObjectMapper mapper=new ObjectMapper();
		
		Map m=new HashMap<>();
		m.put("name","pradeep");
		m.put("city","jaunpur");
		m.put("age", 17);
		
//		jo.put("student", m);
//		
//		try {
//			FileWriter file = new FileWriter("mahadev.json");
//			file.write(jo.toJSONString());
//			
//		} catch (IOException e1) {
//			
//			e1.printStackTrace();
//		}
		
	try {
		//convert map to json string 
		String 	json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(m);
		
		System.out.println(json);
	} catch (JsonProcessingException e) {
		
		e.printStackTrace();
	}
	}

}
