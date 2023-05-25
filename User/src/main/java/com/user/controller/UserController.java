package com.user.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.user.model.User;
import com.user.repo.UserRepository;
import com.user.service.UserService;


@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/home")
	public String homePage() {

		return "home";
	}

	@PostMapping("/processData")
	public String saveUser(@ModelAttribute @Valid User user,BindingResult result) {
		if(result.hasErrors()) {
			
			return "home";
		}
		
		userService.AddUser(user);
		return "redirect:/get";
	}

	@GetMapping("/get")
	public String getUser(Model model ) {
	
		List<User> users = userService.getAllUser();
		
		model.addAttribute("user",users);
		
		return "userlist";
	}
	
	@GetMapping("/delete/{id}")
	public String  delete(@PathVariable int  id) {
		
		userService.userDelete(id);
		return "redirect:/get";
	}
	
	@GetMapping("/edit/{id}")
	public String Edit(@PathVariable int id,Model model) {
		
		Optional<User> user1= userService.editUser(id);
		 User user2 = user1.get();
		 model.addAttribute("user", user2);
		 return "update";
	}
	
	@PostMapping("/update/{id}")
	public String updateUser(@PathVariable int id, @Valid User user, Model model) {
		
		userService.UpdateUser(user);
		model.addAttribute("user", userService.getAllUser());
		
		return "userlist";
	}
	
}
