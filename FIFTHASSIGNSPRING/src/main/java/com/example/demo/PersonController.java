package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;
@Controller

public class PersonController {

	


	
	

		// for welcome page "Home.html"

		
		@GetMapping("person")
		public String before()
		{
			return "Person";
		}
		
		@PostMapping("view")
		public String afterSubmit(@RequestParam("name") String name,@RequestParam("address") String address,@RequestParam("age") int age,Model model) 
		{
			Person p=new Person();
			p.setName(name);
			p.setAddress(address);
			p.setAge(age);
			model.addAttribute("mb", p);
			return "view";
		}
	
}
