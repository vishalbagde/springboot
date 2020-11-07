package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.spring.boot.dao.BookRepo;
import com.spring.boot.entity.Book;


public interface BookService  {
	
	
	
    public List<Book> findAll();
    public Book add(Book book);
    public Book getBookById(int id);
    public void deleteBookById(int id);
    public Book updateBookById(int id,Book book);

        

}
