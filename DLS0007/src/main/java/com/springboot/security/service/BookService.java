package com.springboot.security.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.security.model.Book;

@Service
public interface BookService{

	Book getBook(int bookId);

	String saveBook(Book book);

	List<Book> removeBook(int bookId);


}
