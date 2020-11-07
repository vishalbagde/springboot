package com.spring.boot.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.boot.entity.Book;
import com.spring.boot.service.BookService;

@Controller
public class ThymeleafController {

	@Autowired
	BookService bookService;

	@RequestMapping("/about")
	public String myAbout(Model model) {

		model.addAttribute("name", "Vishal Bagde");
		model.addAttribute("date", new Date().toLocaleString());
		System.out.println("call");
		return "about";
	}

	@RequestMapping("/booklist")
	public String getUser(Model model) {
		
		//List<Book> booklist = bookService.findAll();
		//model.addAttribute("booklist",booklist);
		List<String> namelist=new ArrayList<String>();
		namelist.add("vishal");
		namelist.add("akash");
		namelist.add("mona");
		namelist.add("abhishek");
		namelist.add("bagde");
		model.addAttribute("namelist",namelist);
		return "booklist";
	}

}
