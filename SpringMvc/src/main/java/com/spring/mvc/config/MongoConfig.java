package com.spring.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

@Configuration
public class MongoConfig {

	
	@Bean
	public MongoDbFactory mongoDbFactory() {

		return new SimpleMongoDbFactory(new MongoClient("localhost", 27017), "Student");
	}

	@Bean
	public MongoTemplate mongoTemplate() {
		
		
		return new MongoTemplate(mongoDbFactory());
	}
}
