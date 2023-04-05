package com.jackson.annotation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


// used for specifying the format at the time of serialization and deserialization. 
public class JsonFormatAnno {

	public static void main(String[] args) throws JsonProcessingException, ParseException {

		Student1 std = new Student1();

		String stdId, stdName, stdAge, stdAddmission;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the student id ");
		stdId = sc.nextLine();
		std.setId(stdId);

		System.out.println("enter the student name");
		stdName = sc.nextLine();
		std.setName(stdName);

		System.out.println("enter the student age ");
		stdAge = sc.nextLine();
		std.setAge(stdAge);

		System.out.println("enter the student addmission ");
		stdAddmission = sc.nextLine();

		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date date = format.parse(stdAddmission);

		std.setAddmission(date);

		// create instance of object mapper 
		ObjectMapper mapper = new ObjectMapper();
		String s = mapper.writeValueAsString(std);

		System.out.println(s);

	}

}

class Student1 {

	private String id;

	private String name;

	private String age;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date addmission;

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("age")
	public String getAge() {
		return age;
	}

	@JsonProperty("age")
	public void setAge(String age) {
		this.age = age;
	}

	@JsonProperty("addmission")
	public Date getAddmission() {
		return addmission;
	}

	public void setAddmission(Date addmission) {
		this.addmission = addmission;
	}

	public Student1(String id, String name, String age, Date addmission) {

		this.id = id;
		this.name = name;
		this.age = age;
		this.addmission = addmission;
	}

	public Student1() {

	}

}