package com.dmantz.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dmantz.Entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {
	
	

}
