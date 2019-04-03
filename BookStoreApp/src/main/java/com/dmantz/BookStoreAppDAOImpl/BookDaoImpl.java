package com.dmantz.BookStoreAppDAOImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dmantz.BookStoreAppDAO.BookDao;
import com.dmantz.BookStoreAppModel.Book;
import com.dmantz.BookStoreAppDAOImpl.BookRowMapper;


@Repository
public class BookDaoImpl implements BookDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Book getBookById(Integer id) {
		System.out.println("Getting Books"); 
		 String GET_Book_SQL="SELECT * FROM  book WHERE ID=?";
	      Book book=jdbcTemplate.queryForObject(GET_Book_SQL,new BookRowMapper(),id);
	      System.out.println("Book is Retrived");
		   return book;	
	}

	@Override
	public Book getBookByName(String name) {

		String GET_Book_SQL="SELECT * FROM  book WHERE NAME=?";
	      Book book=jdbcTemplate.queryForObject(GET_Book_SQL,new BookRowMapper(),name);
	      System.out.println("BookName is Retrived");
		return book;

	}
	
	@Override
	public List<BookRowMapper> getAllBooks() {
		System.out.println("Getting Books"); 
		 String GET_Book_SQL="SELECT * FROM  book ";	     
		 List book=jdbcTemplate.query(GET_Book_SQL, new BookRowMapper());		
	      System.out.println("Books are Retrived");
	      return book;
	      
	   /*List<BookRowMapper> book=jdbcTemplate.queryForList(GET_Book_SQL, BookRowMapper.class);      
	     List<BookRowMapper> book1=new ArrayList<BookRowMapper>();
	               // Iterator<BookRowMapper> itr=book1.iterator();
	                while(itr.hasNext()) {	      
		     	     itr.next();
		     	     System.out.println(itr);
		}*/
	      
	                
	}
}
