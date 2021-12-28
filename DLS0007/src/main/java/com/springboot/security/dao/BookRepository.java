package com.springboot.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.security.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

	Book findOne(int bookId);

	void delete(int bookId);

}
