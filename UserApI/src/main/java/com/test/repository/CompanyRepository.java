package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company,String> {
	
	Company findByUsername(String username);
	

}
