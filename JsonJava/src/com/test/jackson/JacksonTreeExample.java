package com.test.jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTreeExample {
	public static void main(String[] args) throws IOException {
		
	final ObjectMapper mapper=new ObjectMapper();
		
		JsonNode tree = mapper.readTree(new File("example.json"));
		
		long id = tree.path("id").asLong();
		System.out.println(id);
		
		JsonNode nameNode = tree.path("name");
		
		if(!nameNode.isMissingNode()) {
			
			// if the namenode is exist
			System.out.println("firstname : "+nameNode.path("first").asText());
			System.out.println("middlename : "+nameNode.path("middel").asText());
			System.out.println("lastName : "+nameNode.path("last").asText());
			
		}
		
		//getContact
		JsonNode contactNode = tree.path("contact");
		if(contactNode.isArray()) {
			
			System.out.println("is this node an array : "+contactNode.isArray());
			
			for(JsonNode node:contactNode) {
				
				String type = node.path("type").asText();
				
				String ref=node.path("ref").asText(); 
				System.out.println("type "+ type);
				System.out.println("ref "+ ref);
			}
		}
		
	}

}
