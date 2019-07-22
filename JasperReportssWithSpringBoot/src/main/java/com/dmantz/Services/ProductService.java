package com.dmantz.Services;

import java.util.List;
import java.util.Map;

import com.dmantz.Entities.Product;

public interface ProductService {
	
	public Iterable<Product> findAll();
	public Product find(int id);
	public List<Map<String,Object>> report();

}
