package com.dmantz.BookStoreAppDAO;

import java.util.List;

import com.dmantz.BookStoreAppDAOImpl.BookRowMapper;
import com.dmantz.BookStoreAppModel.Book;

public interface BookDao {
	
	public abstract Book getBookById(Integer id);
	public abstract Book getBookByName(String name);
	public List<BookRowMapper> getAllBooks();

}
