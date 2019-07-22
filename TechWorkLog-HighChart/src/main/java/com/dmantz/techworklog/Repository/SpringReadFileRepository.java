package com.dmantz.techworklog.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dmantz.techworklog.model.User;

@Repository
public interface SpringReadFileRepository extends CrudRepository<User,Long> {
	
	
	

}
