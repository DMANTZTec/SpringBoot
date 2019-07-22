package com.dmantz.Services;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmantz.Entities.Product;
import com.dmantz.Repositories.ProductRepository;


@Service("ProductService")
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productRepository;
	@Override
	public Iterable<Product> findAll() {

		return productRepository.findAll();
	}

	@Override
	public Product find(int id) {
		
		return productRepository.findOne(id);
	}

	@Override
	public List<Map<String, Object>> report() {
		
		List<Map<String, Object>> result=new ArrayList<Map<String, Object>> ();
		
		for(Product product:this.findAll()) {
			Map<String, Object> item=new HashMap<String,Object>();
			
			item.put("id",product.getId());
			item.put("name",product.getName());
			item.put("price",product.getPrice());
			item.put("quantity",product.getQuantity());
			item.put("categoryName",product.getCategoryName());
			
			result.add(item);
			
		}
		
		
		return result;
	}

}
