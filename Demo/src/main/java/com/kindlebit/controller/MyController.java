package com.kindlebit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kindlebit.dto.CustomerOrderDetailDTO;
import com.kindlebit.entity.Order;
import com.kindlebit.repository.OrderRepository;
import com.kindlebit.service.CustomerService;

@RestController
public class MyController {
	
	@Autowired
	private CustomerService customerService;

	@Autowired
	private OrderRepository orderRepository;
	
	@PostMapping("/add/{id}")
	public  Order saveOrder(@RequestBody Order order,@PathVariable int id) {
		
		
	return	customerService.saveData(order,id);
	}
	
	@GetMapping("/orderbycustomer")
	public List<Order> getOrderByCustomer(){
		
		return orderRepository.findAllOrderByCustomer();
	}
	
	// New api to fetch the dto data
	
	@GetMapping("/dto_list")
	public List<CustomerOrderDetailDTO>  getDto(){
		
		List<CustomerOrderDetailDTO>  customerOrderDetailDTO = orderRepository.getCustomerOrderDetailDTO();
		
		return customerOrderDetailDTO ;
	}
	
	
}
