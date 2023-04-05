package com.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrListSynchronised {
	public static void main(String[] args) {
		
	// make arraylist synchronised 	
	List<String> l=	new ArrayList<>();
List l1=Collections.synchronizedList(l);

	l1.add("ashu");
	l1.add("pritesh");
	System.out.println(l1);
	
	}

}
