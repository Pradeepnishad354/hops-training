package com.project;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoConnection {

	public static MongoDatabase getConnection() {
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase database = mongoClient.getDatabase("Student");
		System.out.println("get database successfully");

//		MongoCollection<Document> collection = database.getCollection("student");
//		System.out.println(" collection create successfully");

		return database;

	}

}
