package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Staff;

public interface StaffRepositoy extends JpaRepository<Staff,Integer> {

	
	
}
