package com.dmantz.EcommerceApplicationDAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dmantz.EcommerceApplicationModel.Product;

public class ProductRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Product pds=new Product();
		
		pds.setProductId(rs.getInt("product_id")); 
		pds.setProductName(rs.getString("product_name"));
		pds.setProductDesc(rs.getString("product_desc"));
		pds.setSearchTag(rs.getString("search_tag"));
		
		return pds;
	}
	
}
