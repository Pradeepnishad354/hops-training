package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;

@Document(collection = "user")
public class User {
	
	@Id
private String id;
	
@NotNull(message = "name can not be null")	
private String name;
@NotNull(message = "email can not be null")	
private String email;

@NotNull(message = "password can not be null")	
private String password;
@NotNull(message = "address can not be null")	
private String address;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public User(String id, String name, String email, String password, String address) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.password = password;
	this.address = address;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}




}
