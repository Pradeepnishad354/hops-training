package com.test.jackson;

import java.io.File;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonToken;

public class JsonParser {

	public static void main(String[] args) {

		JsonFactory jsonFactory = new JsonFactory();
		try {
			com.fasterxml.jackson.core.JsonGenerator jsonGenerator = jsonFactory
					.createGenerator(new File("student.json"), JsonEncoding.UTF8);
			jsonGenerator.writeStartObject();
			jsonGenerator.writeStringField("name", "Mahesh Kumar");
			jsonGenerator.writeNumberField("age", 21);
			// jsonGenerator.writeBooleanField("verified", false);
			jsonGenerator.writeFieldName("marks");
			jsonGenerator.writeStartArray(); // [
			jsonGenerator.writeNumber(100);
			jsonGenerator.writeNumber(90);
			jsonGenerator.writeNumber(85);
			jsonGenerator.writeEndArray();
			jsonGenerator.writeEndObject();
			jsonGenerator.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			com.fasterxml.jackson.core.JsonParser jsonParser = jsonFactory.createParser(new File("student.json"));

			while (jsonParser.nextToken() != JsonToken.END_OBJECT) {

				// get the current token

				String fieldname = jsonParser.getCurrentName();
				if ("name".equals(fieldname)) {

					// move next token
					jsonParser.nextToken();
					System.out.println(jsonParser.getText());

				}

				if ("age".equals(fieldname)) {

					jsonParser.nextToken();
					System.out.println(jsonParser.getNumberValue());

				}

				if ("marks".equals(fieldname)) {

					jsonParser.nextToken();

					while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
						System.out.println(jsonParser.getNumberValue());
					}
				}
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
