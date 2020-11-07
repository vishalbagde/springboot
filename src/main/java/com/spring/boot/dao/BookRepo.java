package com.spring.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
