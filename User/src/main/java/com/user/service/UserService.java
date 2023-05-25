package com.user.service;

import java.util.List;
import java.util.Optional;

import com.user.model.User;
import com.user.repo.UserRepository;



public interface UserService {
	
	public void AddUser(User user);
	
	public List<User> getAllUser();
	
	public void userDelete(int id);
	


	public Optional<User> editUser(int id );
	
	public void UpdateUser( User user);
		
		
	

}
