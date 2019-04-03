package com.dmantz.BookStoreAppDAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dmantz.BookStoreAppModel.Book;

public class BookRowMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book=new Book();
		book.setID(rs.getInt("ID"));
		book.setName(rs.getString("NAME"));
		book.setAuthor(rs.getString("AUTHOR"));
		book.setValue(rs.getInt("VAlUE"));
		
		return book;
	}
	
	

}
