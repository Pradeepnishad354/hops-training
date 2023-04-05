package com.spring.mvc.model;

import org.springframework.data.annotation.Id;


//@Document(collection = "user")
public class User {

	
	@Id
	private String id;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String email;
	private String name;
	private String password;
  private String city;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public User(String id, String email, String name, String password, String city) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
		this.city = city;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
