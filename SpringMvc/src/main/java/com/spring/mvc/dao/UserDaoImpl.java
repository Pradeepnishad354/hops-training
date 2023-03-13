package com.spring.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.spring.mvc.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private MongoTemplate mongoTemplate;	
	
	private static final String COLLECTION_NAME="user";

	public void add(User user) {
		
		mongoTemplate.insert(user,COLLECTION_NAME);
		
		
	}
	
	

}
