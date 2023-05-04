package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.model.Staff;
import com.demo.repository.StaffRepositoy;
import com.demo.service.StaffService;

@Controller
public class StaffController {

	@Autowired
	private StaffService staffService;
	
	@Autowired
	private StaffRepositoy staffRepositoy;
	
	@GetMapping("/add")
	public String homeData() {
		
		return "add";
		
	}
	
	
	@PostMapping("/processData")
	public String home(@ModelAttribute Staff staff) {
		
		staffService.addStaff(staff);
		
		
		return "redirect:/add";
	}
	
	@GetMapping("/get")
	public String findData(Model model) {
		
		List<Staff> findAll = staffRepositoy.findAll();
		
		model.addAttribute("staff", findAll);
		
		return "list";
		
		
	}
	
	@GetMapping("/delete/{id}")
	public String deleteData(@PathVariable int id) {
		
		staffRepositoy.deleteById(id);
		
		return "redirect:/get";
	}
	
	
	@GetMapping("/update/{id}")
	public String showStaffData(@PathVariable int id,Model model) {
		
		Optional<Staff> findById = staffRepositoy.findById(id);
		Staff staff = findById.get();
		
		model.addAttribute("staff",staff);
		return "update";
	}
}
