package com.test.jackson;

import java.io.File;
import java.util.Map;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

//jackson Streaming example->Json Generator
public class JsonGenerator {

	public static void main(String[] args) {

		try {
			JsonFactory j = new JsonFactory();
			com.fasterxml.jackson.core.JsonGenerator jGenerator = j.createGenerator(new File("mahadev.json"),
					JsonEncoding.UTF8);

			jGenerator.writeStartObject();

			jGenerator.writeStringField("name", "mkyong");
			jGenerator.writeNumberField("age", 38);

			jGenerator.writeFieldName("mark");

			jGenerator.writeStartArray();

			jGenerator.writeNumber(100);
			jGenerator.writeNumber(80);
			jGenerator.writeNumber(90);

			jGenerator.writeEndArray();

			jGenerator.writeEndObject();
			jGenerator.close();

			ObjectMapper mapper = new ObjectMapper();

			Map<String, Object> dataMap = mapper.readValue(new File("mahadev.json"), Map.class);

			
			System.out.println(dataMap.get("name"));
			System.out.println(dataMap.get("age"));
			System.out.println(dataMap.get("mark"));
		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}
