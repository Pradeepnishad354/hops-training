package com.test.annotation;

import java.lang.annotation.Annotation;

@MyAnno
public class CustomAnnotation {
	
	public static void main(String[] args) {
		
		
	Demo d=new Demo();
	Class c = d.getClass();
	
	System.out.println(c.getName());
	
	
	MyAnno a =(MyAnno)c.getAnnotation(MyAnno.class);
	System.out.println(a.myValue());
	System.out.println(a.name());
	System.out.println(a.city());
	
	
			
		
	}

	
	
}
