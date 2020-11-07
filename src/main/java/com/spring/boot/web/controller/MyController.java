package com.spring.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("home controller call");
		return "home";
	}

}
