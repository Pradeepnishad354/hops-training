package com.crud.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.crud.entity.User;
import com.crud.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("userlist",userRepository.findAll());
		
		return "home";
	}
	
	@GetMapping("/saveuserPage")
	public String saveuserPage(Model model) {
		
		User user=new User();
		model.addAttribute("user",user);
		
		return "add_user";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") User user) {
		userRepository.save(user);
		return "redirect:/";
		
		
	}
	@GetMapping("/updateUserPage/{id}")
	public String showUserUpdatePage(@PathVariable("id") int id,Model model) {
		
		Optional<User> u=userRepository.findById(id);
		User user=u.get();
		model.addAttribute("user",user);
		return "update_user";
		
		
		
	}
	
	
	
	@GetMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") int id) {
		
		userRepository.deleteById(id);
		return "redirect:/";
		
		
	}
	
	
}
