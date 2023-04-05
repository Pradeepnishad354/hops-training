package com.spring.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Ring implements InitializingBean ,DisposableBean{
	
	
	private String price;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Ring(String price) {
		super();
		this.price = price;
	}

	public Ring() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ring [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("take th ring : init method");
		
	}

	public void destroy() throws Exception {
		System.out.println("close the shop : destroy");
		
	}
	

}
