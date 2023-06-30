package com.kindlebit.service;

import java.util.List;

import com.kindlebit.dto.CustomerOrderDetailDTO;
import com.kindlebit.entity.Order;

public interface CustomerService {
	
public Order saveData(Order order,int id);
	

public List<CustomerOrderDetailDTO> getCustomerOrder();
	
	

	
}
