package com.test.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonEncode {
	
	public static void main(String[] args) {
		
		
		
		JSONObject j=new JSONObject();
		
		j.put("name","pradeep");
		j.put("age",23);
		j.put("salary",20000);
		
		System.out.println(j);
		
		// json encode using map 
		
		Map p=new HashMap<>();
		
		p.put("name", "p");
		p.put("age", 37);
		p.put("salary",19090.98);
		
	String t=	JSONValue.toJSONString(p);
	System.out.println("encode using map"+t);
	
	
	// Json Array Encode
	JSONArray jarr=new JSONArray();
	
	jarr.add("pradeep");
	jarr.add(new Integer(10));
	jarr.add(5625);
	
	System.out.println("json array "+jarr);
	
	
// json array encode using list
	
	List arr=new ArrayList<>();
	
	arr.add("mahadev");
	arr.add("pp");
	arr.add("nirmam");
	
String t2=	JSONValue.toJSONString(arr);
	System.out.println("json array encode using list "+t2);
	
	}

}
