package com.spring.core.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")

public class Student {
	
	@Value("pradeep")
	private String name;
	
	@Value("jaunpur")
	private String city;
	
	@Value("#{ab}")
	private List<Integer> phones; 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	
	
	public List<Integer> getPhones() {
		return phones;
	}

	public void setPhones(List<Integer> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	
	

}
