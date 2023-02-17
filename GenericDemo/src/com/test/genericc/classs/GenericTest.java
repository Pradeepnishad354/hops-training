package com.test.genericc.classs;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericTest {

	public static void main(String[] args) {
		
		
		ArrayList l = new ArrayList();
		l.add("mahadev");
		l.add("jay");
		l.add("saurabh");
		l.add(10);
		l.add(10.5);
		
	Iterator itr=	l.iterator();
	
	while(itr.hasNext()) {
		
//		String s=itr.next(); compile time error
		
		Object s=itr.next();
		if(s instanceof String) {
			String data=(String)s;
			System.out.println(data);
		}else if(s instanceof Integer) {
			
		Integer	data1=(Integer)s;
		System.out.println(data1);
			
		}else if(s instanceof Double) {
			
			Double d=(Double)s;
			System.out.println(d);
		}
		else {
			System.out.println(s);
		}
	}
	}
}
