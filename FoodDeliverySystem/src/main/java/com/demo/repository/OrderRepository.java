package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Order;
import com.demo.model.Staff;
@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

	
	
}
