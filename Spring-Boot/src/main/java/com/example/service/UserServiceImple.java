package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserRepository;
import com.example.model.User;

@Service
public class UserServiceImple  implements UserService{

	
	@Autowired
	private UserRepository  userRepository;
	@Override
	public User addUser(User user) {
		
		return userRepository.save(user);
		
	}
	
	@Override
	public List<User> getUser() {
		
		return userRepository.findAll();
	}

	@Override
	public User findById(String id) {
		
		return userRepository.findById(id).get();
	}

	@Override
	public void delete(String id) {
		
		 userRepository.deleteById(id);
		 
	}

	@Override
	public void updateUser(User user,String id) {
		
		 User user2 = userRepository.findById(id).get();
		 
		 System.out.println(user2.toString());
		 
		 user2.setName(user.getName());
		 user2.setEmail(user.getEmail());
		 user2.setAddress(user.getAddress());
		 user2.setPassword(user.getPassword());
		 
		  userRepository.save(user2);
		
		 
	}

		
	}
	

