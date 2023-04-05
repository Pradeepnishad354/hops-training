package com.spring.mvc.service;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.dao.UserDao;
import com.spring.mvc.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public void add(User user) {
		
		userDao.add(user);
	}

	public List<Document> findAllUsers() {
		
		return userDao.findAllUser();
		
	}
	
	

}
