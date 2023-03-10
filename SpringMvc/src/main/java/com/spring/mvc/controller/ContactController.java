package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.model.User;
import com.spring.mvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService  userService;
	//sending the common data for allmethod
	
	
	
	@ModelAttribute
	public void commonDataForModel(Model model) {
		
		model.addAttribute("Header","fill this");
		model.addAttribute("Desc","this is your home page ");
	}
	
	
	
@RequestMapping("/contact")
	public String show(Model model) {
	System.out.println("register contact");
	
	
		return "contact";
		
	}

@RequestMapping(path="/processForm",method = RequestMethod.POST)
public String handleForm(@ModelAttribute User user, Model model) {
	
	this.userService.createUser(user);

	return"success";
}
}


// use @requestparam...............

/*
 * @RequestMapping(path="/processForm",method = RequestMethod.POST) public
 * String handleForm(@RequestParam(name="email",required=false)String
 * email,@RequestParam("name") String name,@RequestParam("password") String
 * password, Model model) {
 * 
 * // System.out.println("user email is"+email); //
 * System.out.println("user name is"+name); //
 * System.out.println("user password is"+password);
 * 
 * 
 * //set the data User user=new User(); user.setEmail(email);
 * user.setName(name); user.setPassword(password);
 * 
 * System.out.println(user); model.addAttribute("user",user);
 * 
 * 
 * 
 * 
 * // model.addAttribute("userEmail",email); //
 * model.addAttribute("userName",name); //
 * model.addAttribute("userPassword",password); return"success"; }
 */











