package com.example.exception;

public class UserCollectionException extends Exception {
	
	public UserCollectionException(String msg) {
		
		super(msg);
		
	}
	
	public static String NotFoundException(String id) {
		
		return "user with"+id+"not found";
	}
	
	public static String UserAlreadyExists() {
		
		return " user given with name laready exists";
	}
	

}
