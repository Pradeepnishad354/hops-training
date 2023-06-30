package com.kindlebit.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindlebit.dto.CustomerOrderDetailDTO;
import com.kindlebit.entity.Customer;
import com.kindlebit.entity.Order;
import com.kindlebit.repository.CustomerReposiotry;
import com.kindlebit.repository.OrderRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerReposiotry customerReposiotry;

	@Autowired
	private OrderRepository orderRepository;
	@Override
	public Order saveData(Order order,int id) {
	
		Optional<Customer> customer = customerReposiotry.findById(id);
		 
		

		 
		

		order.setCustomer(customer.get());
		
		return orderRepository.save(order);
	}
	@Override
	public List<CustomerOrderDetailDTO> getCustomerOrder() {
		
		List<Customer> customers=customerReposiotry.findAll();
		
		
		
		for(Customer customer:customers) {
			
			Customer customer1 = orderRepository.findByCustomerId(customer.getId());
			
		}
		
		return null;
	}

	
}