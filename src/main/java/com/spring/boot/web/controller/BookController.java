package com.spring.boot.web.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entity.Book;
import com.spring.boot.service.BookService;

@CrossOrigin
@RestController
public class BookController {
	
	
	@Autowired
	BookService bookService;

	@GetMapping(value = "/books")
	public List<Book> getBooks()
	{
		List<Book> booklist = bookService.findAll();
		return booklist;
	}
	
	@GetMapping(value = "/books/{id}")
	public Book getBooks(@PathVariable("id") int id)
	{
		Book book = bookService.getBookById(id);
		System.out.println("hello");
		return book;
		
	}
	
	@PostMapping(value = "/books")
	public Book addBook(@RequestBody Book book)
	{
		System.out.println("post maping call");
		return bookService.add(book);
	}
	
	@DeleteMapping(value = "/books/{id}")
	public Book deleteBooks(@PathVariable("id") int id)
	{
		Book book = bookService.getBookById(id);
		bookService.deleteBookById(id);
		return book;
		
	}
	
	@PutMapping(value = "/books/{id}")
	public Book updateBooks(@PathVariable("id") int id,@RequestBody Book book)
	{
		Book b = bookService.updateBookById(id, book);
		return b;
	}
}
