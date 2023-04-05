package com.jackson.annotation;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//@JsonIdentityInfo is used when objects have parent child relationship. @JsonIdentityInfo is used to indicate that object
//identity will be used during serialization/de-serialization.

public class JsonIdentityInfoAnno {
	public static void main(String[] args) throws JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();

		Student15 student = new Student15(1, 23, "pradeep");
		
		Book book1 = new Book(1, "java", student);
		Book book2 = new Book(2, "angular", student);

		student.addBook(book1);
		student.addBook(book2);

		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
		System.out.println(json);

	}
}

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
class Student15 {

	public int id;
	public int rollNo;
	public String name;

	public List<Book> books;

	public Student15(int id, int rollNo, String name) {
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
		this.books = new ArrayList<Book>();
	}

	public void addBook(Book book) {

		books.add(book);
	}
}

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
class Book {
	public int id;
	public String name;

	Student15 owner;

	public Book(int id, String name, Student15 owner) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
	}

}