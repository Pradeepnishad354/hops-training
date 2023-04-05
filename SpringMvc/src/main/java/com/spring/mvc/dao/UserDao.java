package com.spring.mvc.dao;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.spring.mvc.model.User;



public interface UserDao {

	/*
	 * @Autowired private MongoTemplate mongoTemplate;
	 * 
	 * private static final String COLLECTION_NAME="user";
	 * 
	 * public void add(User user) {
	 * 
	 * if(!mongoTemplate.collectionExists(User.class)) {
	 * 
	 * mongoTemplate.createCollection(User.class); }
	 * mongoTemplate.insert(user,COLLECTION_NAME); }
	 * 
	 */
	
	
	public void add(User user);
	
//	public List<User> getAllData();
	
	public void delete(String id);
	
	public List<org.bson.Document> findAllUser();
	
}
