package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.User;
import com.user.repo.UserRepository;

@Service
public class UserServiceimpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void AddUser(User user) {
		
		userRepository.save(user);
		
	}

	@Override
	public List<User> getAllUser() {
		
	return	userRepository.findAll();
		
	}

	@Override
	public void userDelete(int id) {
		
		userRepository.deleteById(id);
		
	}

	@Override
	public Optional<User> editUser(int id) {
	
		return userRepository.findById(id);
		
	}

	@Override
	public void UpdateUser( User user) {
		
		userRepository.save(user);
		
		
		
	}

	
	

}
