package com.raj.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ThymLeafController {

	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Going to home page");
		model.addAttribute("name", "sp abinash");
		return "home"; //home.html
	}
	//handler for iteration
	@GetMapping("/loop")
	public String iteratethym(Model m) {
		// create a list and send in html view
		List<String>nameList = List.of("raju", "suresh", "mohan", "gita", "tikaram", "madan", "prakash", "bhuwan", "govind", "bimal");
		 m.addAttribute("namelist",nameList);
		
		
		return "exampleLoop";
	}
	//handler for conditional
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		m.addAttribute("isActive", true);
		m.addAttribute("gender", "male");
		List<String>list = List.of("raju", "suresh", "mohan", "gita", "tikaram", "madan", "prakash", "bhuwan", "govind", "bimal");
		 m.addAttribute("namelist",list);
		return "conditionalCase";
	}
	 @GetMapping("/about")
	 public String about(Model model) {
		 
		 return "about";
	 }
	 @GetMapping("/service")
	 public String services(Model model) {
		 
		 return "services";
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
