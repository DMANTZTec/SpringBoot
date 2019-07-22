package com.dmantz.BookStoreAppController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.BookStoreAppDAO.BookDao;
import com.dmantz.BookStoreAppDAOImpl.BookRowMapper;
import com.dmantz.BookStoreAppModel.Book;

@RestController
@RequestMapping("/user")
public class BookController {
	@Autowired
	private BookDao bookDao;
	
	@RequestMapping(value="/getBookId")
	public void getBookById(){
		
           Book book=bookDao.getBookById(5);
           
		System.out.println(book.toString());
		
           }
	
	@RequestMapping(value="/getBookName")
	public void getBookByName() {
		
		Book book=bookDao.getBookByName("JAVASCRIPT");
        
		System.out.println(book.toString());
		
		
	}
	
	@RequestMapping(value="/getAllBooks")
	public void getAllBooks() {
		
		List<BookRowMapper> book=bookDao.getAllBooks();
		System.out.println(book);
	}
	

	
	}
	
	


