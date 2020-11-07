package com.spring.boot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.boot.dao.BookRepo;
import com.spring.boot.dao.UserRepo;
import com.spring.boot.entity.Author;
import com.spring.boot.entity.Book;
import com.spring.boot.entity.User;



@SpringBootApplication
public class SpringbootApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
		
		
		UserRepo userrepo = context.getBean(UserRepo.class);
		
		
		 BookRepo bookrepo = context.getBean(BookRepo.class);
		 
		 List<Book> booklist=new ArrayList<Book>();
		 Author author = new Author("vishal","bagde","english");
		 booklist.add(new Book("Java",author));
		 booklist.add(new Book("C++",author)); 
		 booklist.add(new Book("J2EE",author));
		 booklist.add(new Book("J2ME",author));
		 bookrepo.saveAll(booklist);		 
		
	}

}
 