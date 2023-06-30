package com.kindlebit.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Order {
	
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String itemName;
private int itemPrice;	

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(foreignKey =@ForeignKey(name="customer_id"),name = "customer_id")
private Customer customer;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	this.itemName = itemName;
}

public int getItemPrice() {
	return itemPrice;
}

public void setItemPrice(int itemPrice) {
	this.itemPrice = itemPrice;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}



}
