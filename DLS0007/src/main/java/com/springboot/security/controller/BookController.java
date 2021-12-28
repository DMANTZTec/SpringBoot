package com.springboot.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.security.model.Book;
import com.springboot.security.service.BookServiceImplements;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookServiceImplements service;
	
	@PostMapping("/save")
	public String saveBook(@RequestBody Book book) {
		return service.saveBook(book);
	}
	
	@GetMapping("/searchBook/{bookId}")
	public Book getBook(@PathVariable int bookId) {
		return service.getBook(bookId);
	}
	
	@DeleteMapping("/deleteBook/{bookId}")
	public List<Book> deleteBook(int bookId){
		return service.removeBook(bookId);
	}
	 

}
