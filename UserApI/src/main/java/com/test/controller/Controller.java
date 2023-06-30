package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Company;
import com.test.repository.CompanyRepository;

@RestController
public class Controller {

	@Autowired
	private CompanyRepository companyRepository;
	
	@PostMapping("/register")
	public ResponseEntity<String> registerCompany(@RequestBody Company company) {
		
		companyRepository.save(company);
		
		return new ResponseEntity<>("registered successfully",HttpStatus.CREATED);
	}
	
	
	@GetMapping("/login")
	public String login(Company company) {
		
	
		
		Company findByUsername = companyRepository.findByUsername(company.getUsername());
		
		if(findByUsername !=null && company.getPassword().equals(findByUsername.getPassword())) {
			
			System.out.println("successfully login");
		}
		
		return "you have successfully login";
	}
	
	

}
