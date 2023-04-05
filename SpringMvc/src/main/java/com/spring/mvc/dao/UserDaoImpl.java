package com.spring.mvc.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.spring.mvc.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private MongoTemplate mongoTemplate;
	
String db="Student";
	
	private static final String COLLECTION_NAME="user";

	public void add(User user) {
		if(!mongoTemplate.collectionExists(User.class)) {
		mongoTemplate.createCollection(User.class);
		
		
		
	}
	user.setId(UUID.randomUUID().toString());
	mongoTemplate.save(user);

	}

	// list
	

	public void delete(String id) {
	
		mongoTemplate.remove(id);
		
	}

//	public List<User> getAllData() {
//		
//		return mongoTemplate.findAll(User.class,"user");
//	}

	@Override
	public List<Document> findAllUser() {
		
		List<Document> list = new ArrayList<>();
		 MongoCollection<Document> collection = mongoTemplate.getCollection(COLLECTION_NAME);
		 
		 FindIterable<Document> find = collection.find();
		 
		Iterator<Document> itr = find.iterator();
		
		
		while(itr.hasNext()) {
			
			Document doc=itr.next();
			list.add(doc);
		}
		return list;
		
	}

	

	
	}

	
	
	
	
