package com.kindlebit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kindlebit.dto.CustomerOrderDetailDTO;
import com.kindlebit.entity.Customer;
import com.kindlebit.entity.Order;

public interface  OrderRepository extends JpaRepository<Order,Integer> {
	
	@Query(value="select * from orders o Join customer c on o.customer_id=c.customer_id ",nativeQuery = true)
	List<Order> findAllOrderByCustomer();
	
	
	public Customer findByCustomerId(int id);
	
	
	@Query(" select new com.kindlebit.dto.CustomerOrderDetailDTO(c.id as customer_id , o.itemName as item_name ,c.name as customer_name ) from Order o Join Customer c on o.customer = c.id ")
	List<CustomerOrderDetailDTO> getCustomerOrderDetailDTO();
	
	
	

}
