package com.spring.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class MongoConfig extends  AbstractMongoClientConfiguration{

	@Override
	protected String getDatabaseName() {
		
		return "Student";
	}

	
	public MongoClient  mongoClient() {
		
		
	final 	ConnectionString connectionString=new ConnectionString("mongodb://localhost:27017/Student");
		final MongoClientSettings  clientSettings=MongoClientSettings.builder()
				.applyConnectionString(connectionString)
				.build();
		return MongoClients.create(clientSettings);
	}
	
	

	
	@Bean
	public MongoTemplate mongoTemplate() {
		
		
		return new MongoTemplate(mongoClient(),"Student");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * @Bean public MongoDbFactory mongoDbFactory() {
	 * 
	 * return new SimpleMongoDbFactory(new MongoClient("localhost", 27017),
	 * "Student"); }
	 * 
	 * @Bean public MongoTemplate mongoTemplate() {
	 * 
	 * 
	 * return new MongoTemplate(mongoDbFactory()); }
	 */
}
