package com.project;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class StudentDao {
	
	
	private MongoCollection<Document> collection;
	
	
	public StudentDao() {
		
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase database = mongoClient.getDatabase("Student");	
		
		this.collection=database.getCollection("student1");
	}

	//save student 
	public void saveStudent(int id,String name,String email,String city) {
		
		
		Document  student=new Document("id",id).append("name", name).append("email", email).append("city", city);
		
		collection.insertOne(student);
	}
	

	//get students 
	public List<Document>  getStudents(){
		
		FindIterable<Document> result = collection.find();
		
		List<Document> student=new ArrayList<>();
		
		for(Document document :result) {
			
			student.add(document);
		}
			
			return student;
		
	}
	
	
	// gets student 
	
	public Document getStudent(int  id) {
        Document query = new Document("id",id);
        FindIterable<Document> result = collection.find(query);
        Document user = result.first();
        return user;
    }
	
	// update student
	public void updateStudent(int id ,String name, String email, String city) {
        Document updateQuery = new Document("id", id);
        Document updateDocument = new Document("$set", new Document("name", name).append("email", email).append("city", city));
        collection.updateOne(updateQuery, updateDocument);
    }
	
	
	
	
	
	
// delete student 
	public void deleteStudent(int id) {
        Document deleteQuery = new Document("id",id);
        collection.deleteOne(deleteQuery);
    }
	
	
}
