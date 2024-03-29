package com.spring.core.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private String name;
	
	private List<String> phones;
	private Set<String> city;
	private Map<String,String> course;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getCity() {
		return city;
	}
	public void setCity(Set<String> city) {
		this.city = city;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	public Employee(String name, List<String> phones, Set<String> city, Map<String, String> course) {
		super();
		this.name = name;
		this.phones = phones;
		this.city = city;
		this.course = course;
	}
	public Employee() {
		super();
		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phones=" + phones + ", city=" + city + ", course=" + course + "]";
	}
	
	
}
