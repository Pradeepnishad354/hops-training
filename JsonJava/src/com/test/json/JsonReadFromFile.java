package com.test.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadFromFile {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		Object obj=new JSONParser().parse(new FileReader("JsonExample.json"));
		
		JSONObject jo=(JSONObject)obj;
		
		String  firstname = (String) jo.get("firstName");
	String lastname=(String)jo.get("lastName");
	
	System.out.println(firstname);
	System.out.println(lastname);
		
		//getting age
	long  age = (long)jo.get("age");
	System.out.println(age);
	
	//getting address
	Map address = ((Map) jo.get("address"));
	
	Iterator itr = address.entrySet().iterator();
	while(itr.hasNext()) {
		Map.Entry p =  (Entry) itr.next();
		
		System.out.println(p.getKey()+"  "+p.getValue());
		
//		JSONArray j=(JSONArray) jo.get("phoneNumbers");
//		Iterator itr1 = j.iterator();
//		
//		while(itr1.hasNext()) {
//			
//		itr= ((Map)itr1.next()).entrySet().iterator();
//		while(itr1.hasNext()) {
//			
//			Map.Entry n = (Entry) itr1.next();
//			System.out.println(n.getKey()+" "+n.getValue());
//			
			
	//	}
	//	}
		
		
	}

	
	
	
		
		
	}

}
