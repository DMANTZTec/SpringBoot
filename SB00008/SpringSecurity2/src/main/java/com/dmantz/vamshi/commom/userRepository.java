package com.dmantz.vamshi.commom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface userRepository extends JpaRepository<Model,Long> 
{
	Model findByUserName(String username);

}
