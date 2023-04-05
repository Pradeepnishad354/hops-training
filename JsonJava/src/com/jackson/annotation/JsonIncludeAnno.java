package com.jackson.annotation;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;


//@JsonInclude is used at exclude properties having null/empty or default values.

//@JsonIgnore is used at field level to mark a property or list of properties to be ignored.

//@JsonIgnoreType is used at mark a property of special type to be ignored.

//@JsonAutoDetect can be used to include properties which are not accessible otherwise.

//@JsonIgnoreProperties is used at class level to mark a property or list of properties to be ignored.
public class JsonIncludeAnno {
	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper();
	      try {
	         Student9 student = new Student9(1,"pritesh","jaunpur");       
	         String jsonString = mapper
	            .writerWithDefaultPrettyPrinter()
	            .writeValueAsString(student);
	         System.out.println(jsonString);
	      }
	      catch (IOException e) { 
	         e.printStackTrace();
	      }     
		
		
		
	}
	
	

}
//@JsonIgnoreProperties({"id"})
//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
class Student9 { 
	   public int id; 
	   
	  // @JsonIgnore
	   public String city;
	   public String name;
	   public Name nameObj;

	   Student9(int id,String name, String city){
	      this.id = id;
	     // this.name = name;
	      this.city=city;
	      nameObj=new Name(name);
	   }  
	}

@JsonIgnoreType
class  Name{
	
public 	String name;
	
	Name(String name){
		this.name=name;
	}
}