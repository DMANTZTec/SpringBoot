package com.springboot.security.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3357849231581532850L;
	@Id
	@GeneratedValue
	private int bookId;
	private String bookName;
	private double price;
	
	

}
