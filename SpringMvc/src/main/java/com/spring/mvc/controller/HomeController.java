package com.spring.mvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {

		model.addAttribute("name", "pradeep nishad");
		model.addAttribute("id", 222109);

		List<String> friends = new ArrayList<String>();

		friends.add("amit");
		friends.add("roshan");
		friends.add("ritik");
		friends.add("saurabh");
		friends.add("rahul");

		// send the object
		model.addAttribute("f", friends);
		System.out.println("this is home url ");

		return "index";
	}

	@RequestMapping("/about")
	public String about() {

		System.out.println("this is about page");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("name", "Pradeep");
		modelAndView.addObject("rollnum", 333);

		LocalDateTime dateTime = LocalDateTime.now();
		modelAndView.addObject("date", dateTime);

		List<Integer> list=new ArrayList<Integer>();
		list.add(1158);
		list.add(1168);
		list.add(167);
		list.add(115);
		
		modelAndView.addObject("number",list);
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	
	@RequestMapping("/mahadev")
	public String Register() {
		
		System.out.println("register contact");
		
		return "contact";
	}

}
