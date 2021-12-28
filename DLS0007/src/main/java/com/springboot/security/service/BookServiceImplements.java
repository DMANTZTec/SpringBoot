package com.springboot.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.security.dao.BookRepository;
import com.springboot.security.model.Book;
@Service
public class BookServiceImplements implements BookService {
	@Autowired
	private BookRepository repository;
	
	@Override
	public String saveBook(Book book) {
		repository.save(book);
		return "book saved" + book.getBookId();
	}
	@Override
	public Book getBook(int bookId) {
		return repository.findOne(bookId);
	}
	@Override
	public List<Book> removeBook(int bookId){
		repository.delete(bookId);;
		return repository.findAll();
	}
	
	
}
