package com.kindlebit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindlebit.entity.Customer;

public interface CustomerReposiotry extends JpaRepository<Customer,Integer> {
	
	

	
	
}
