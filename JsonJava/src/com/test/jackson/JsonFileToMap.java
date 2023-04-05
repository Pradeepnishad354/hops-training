package com.test.jackson;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.annotation.processing.AbstractProcessor;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

//json file to map using jackson 
public class JsonFileToMap {
	public static void main(String[] args) {

		// create instance of the ObjectMapper class to map JSON data
		ObjectMapper mapper = new ObjectMapper();

		// create instance of the file

		File file = new File("JsonExample.json");

		try {
			// read JSON data from file using file and map it using ObjectMapper and
			// TypeReference classes
			Map<String, Object> user = mapper.readValue(file, new TypeReference<Map<String, Object>>() {

			});

			// print all key-Value pair

			System.out.println("firstName " + user.get("firstName"));
			System.out.println("lastName " + user.get("lastName"));
			System.out.println("age " + user.get("age"));
		} catch (StreamReadException e) {

			e.printStackTrace();
		} catch (DatabindException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
