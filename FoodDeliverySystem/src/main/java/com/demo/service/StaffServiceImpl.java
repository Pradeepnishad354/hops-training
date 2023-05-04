package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Staff;
import com.demo.repository.StaffRepositoy;
@Service
public class StaffServiceImpl implements StaffService{

	@Autowired
	private StaffRepositoy staffRepositoy;
	@Override
	public void addStaff(Staff staff) {
	
		staffRepositoy.save(staff);
		
		
	}

	
	
	
}
