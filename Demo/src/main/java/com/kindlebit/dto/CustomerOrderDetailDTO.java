package com.kindlebit.dto;

public class CustomerOrderDetailDTO {
	
	public CustomerOrderDetailDTO(int customer_id, String customer_name, String item_name) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.item_name = item_name;
	}

	private int customer_id;
	private String customer_name;
	private String  item_name;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	
}
