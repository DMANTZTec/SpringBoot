package com.dmantz.EcommerceApplicationDAO;



import java.util.List;

import com.dmantz.EcommerceApplicationDAOImpl.OptionsRowMapper;
import com.dmantz.EcommerceApplicationDAOImpl.ProductRowMapper;
import com.dmantz.EcommerceApplicationModel.Options;

public interface OptionsDao {

	//public abstract void addAllOptions(Options ops);

	public void addAllOptions(List<Options> options);
	
	public List<ProductRowMapper> getAllProducts();

}
