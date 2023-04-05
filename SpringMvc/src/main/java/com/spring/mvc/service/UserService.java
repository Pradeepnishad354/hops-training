package com.spring.mvc.service;

import java.util.List;

import org.bson.Document;

import com.spring.mvc.model.User;


public interface UserService {

	public void add(User user);
	
	public List<Document> findAllUsers();
}
