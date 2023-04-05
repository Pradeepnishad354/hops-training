package com.test.json;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWriteToFile {

	public static void main(String[] args) throws FileNotFoundException {

		// creating json object
		JSONObject jo = new JSONObject();
		jo.put("firstName", "pradeep");
		jo.put("lastName", "nishad");
		jo.put("age", 22);

		// linkedHashMap

		Map m = new LinkedHashMap<>();

		m.put("street", "nauperwa");
		m.put("city", "jaunpur");
		m.put("pincode", 222109);

		// putting address into json Object
		jo.put("address", m);

		// for phone numbers we create json array

		JSONArray ar = new JSONArray();

		Map p = new LinkedHashMap<>();
		p.put("type", "home");
		p.put("number", 84168879);

		
		//adding the map to list
		ar.add(p);
		
		// putting phoneNumbers into json
		jo.put("phoneNumbers", ar);
		
		System.out.println(jo);
		
		PrintWriter printWriter = new PrintWriter("JSonExample.json");
		
		printWriter.write(jo.toJSONString());
		
		printWriter.close();

	}

}
