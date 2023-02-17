package com.test.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonArrayList implements Iterable<Person> {

	private List<Person> persons;
	private static final int MIN_AGE = 10;

	public PersonArrayList() {

		persons = new ArrayList<Person>(MIN_AGE);

	}

	public PersonArrayList(int age) {

		persons = new ArrayList<>(age);
	}

	public void addPerson(Person p) {

		persons.add(p);

	}

	public void removePerson(Person p) {

		persons.remove(p);
	}

	public int age() {

		return persons.size();
	}

	@Override
	public Iterator<Person> iterator() {

		return persons.iterator();
	}

	public static void main(String[] args) {
		Person p1=new Person("amit","katiyar",10);
		Person p2=new Person("av","e", 45);
		
		PersonArrayList list = new PersonArrayList();
		
		list.addPerson(p1);
		list.addPerson(p2);
		
		for(Person p : list) {
			
			System.out.println(p);
		}
		
		
		
		
		

	}

}
