package com.dmantz.vamshi.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class Userrepository {
	
	@Autowired
	 JdbcTemplate jdbcTemplate;
	public List<String> getAllNames(){
		List<String> empnameList=new ArrayList<>();
		empnameList.addAll(jdbcTemplate.queryForList("SELECT fname FROM abc.emp", String.class));
		return empnameList;
	}
	public List<String> getAllAges(){
		List<String> empAgeList=new ArrayList<>();
		empAgeList.addAll(jdbcTemplate.queryForList("SELECT age FROM abc.emp", String.class));
		return empAgeList;
	}
	

}
