package com.spring.boot.web.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.boot.entity.Login;

@Controller
public class ValidationController {
	
	
	@RequestMapping("login")
	public String openForm(Model model)
	{
		System.out.println("test");
		model.addAttribute("logindata",new Login());
		return "login";
	}
	@PostMapping("process")
	public String processForm(@Valid @ModelAttribute("logindata")Login login,BindingResult result)
	{
		if(result.hasErrors())
		{
			System.out.println(result);
		}
		System.out.println(login);
		return "login";
	}
	

}
