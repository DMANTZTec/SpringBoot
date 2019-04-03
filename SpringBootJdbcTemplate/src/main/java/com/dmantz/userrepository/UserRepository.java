package com.dmantz.userrepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class UserRepository {
	@Autowired
	JdbcTemplate jdbctemplate;

	public List<String> getAllUserNames() {
		
		System.out.println("Enter into getAllUserNames");
		String sql="select * from user";
		List usernamelist=jdbctemplate.queryForList(sql);
		return usernamelist;
	}

}
