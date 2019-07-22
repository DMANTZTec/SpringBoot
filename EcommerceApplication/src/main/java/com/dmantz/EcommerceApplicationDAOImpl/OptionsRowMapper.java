package com.dmantz.EcommerceApplicationDAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dmantz.EcommerceApplicationModel.Options;
import com.dmantz.EcommerceApplicationModel.Product;

public class OptionsRowMapper implements RowMapper<Options>{

	@Override
	public Options mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		Options ops=new Options();
				
		ops.setOptionId(rs.getInt("optionId"));
		ops.setOptionName(rs.getString("optionName"));
		ops.setOptionValue(rs.getString("optionValue"));
		
		
					
		return ops;
		
	}
	
	
	 }


