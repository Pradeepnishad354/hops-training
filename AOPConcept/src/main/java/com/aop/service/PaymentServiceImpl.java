package com.aop.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

	public void makePayment() {
		
		//
		System.out.println("money debited .....");
		
		
		
		
		//
		
		System.out.println("money credited ....");
		
	}

}
