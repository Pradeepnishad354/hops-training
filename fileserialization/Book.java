package com.test.fileserialization;

import java.io.Serializable;

public class Book implements Serializable {

	@Override
	public String toString() {
		return "Book [bookCode=" + bookCode + ", bookName=" + bookName + "]";
	}

	private static final long serialVersionUID = 1L;

	int bookCode;
	String bookName;
	
	public Book(int bookCode,String bookName) {
		
		this.bookCode=bookCode;
		this.bookName=bookName;
		
		
	}

}
