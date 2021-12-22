package com.dmantz.vamshi.commom;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepositiory extends CrudRepository<User, Long> 
{
	@Query("select u from User u where u.username=:username")
public User getUserByUsername(@Param("username") String username);
}
