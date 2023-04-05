package com.example.service;

import java.util.List;

import com.example.model.User;

public interface UserService {
	
	
	public User addUser(User user);
	
	public List<User> getUser();
	
	public User findById(String id);
	
	public void delete(String id);
	
	public void updateUser(User user,String id);

}
