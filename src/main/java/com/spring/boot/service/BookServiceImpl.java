package com.spring.boot.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.spring.boot.dao.BookRepo;
import com.spring.boot.entity.Book;

@Component
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepo bookRepo;
	
	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return (List<Book>) bookRepo.findAll();
	}
	
	@Transactional
	@Override
	public Book add(Book book) {
		Book b=bookRepo.save(book);
		return b;
		
	}
	
	@Override
	public Book getBookById(int id) {
	
		return bookRepo.findAll().stream().filter(e->e.getId()==id).findFirst().get();
	}
	
	@Transactional
	@Override
	public void deleteBookById(int id) {
		bookRepo.deleteById(id);
	}
	
	@Transactional
	@Override
	public Book updateBookById(int id,Book book) {
		Book b=bookRepo.getOne(id);
		b.setName(book.getName());
		b.setAuthor(book.getAuthor());
		bookRepo.save(b);
		return b;
		


	}

}
