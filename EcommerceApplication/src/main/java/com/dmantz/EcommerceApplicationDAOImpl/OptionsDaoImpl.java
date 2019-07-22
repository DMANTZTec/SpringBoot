package com.dmantz.EcommerceApplicationDAOImpl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.dmantz.EcommerceApplicationDAO.OptionsDao;
import com.dmantz.EcommerceApplicationModel.Options;


@Repository
public  class OptionsDaoImpl implements OptionsDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addAllOptions(List<Options> options) {
		
		String add_options_SQL="insert into options(option_id,option_name,option_value) values(?,?,?)";
		List<Object[]> batchArgList=new ArrayList<Object[]>();
		
		for(Options ops:options) {
			
			Object[] obj= {ops.getOptionId(),ops.getOptionName(),ops.getOptionValue()};
			
			batchArgList.add(obj);
			
		}
		
		jdbcTemplate.batchUpdate(add_options_SQL, batchArgList);
		
		
	}

	@Override
	public List<ProductRowMapper> getAllProducts() {
		System.out.println("Getting Products"); 
		 String GET_Product_SQL="SELECT * FROM  Product ";	     
		 List pds=jdbcTemplate.query(GET_Product_SQL, new ProductRowMapper());		
	      System.out.println("Products are Retrived");
	      return pds;
	      
	}

	

	/*@Override
	public void addAllOptions(Options ops) {
		System.out.println("Adding Options"); 
		 String Add_Options_SQL="insert into options(option_id,option_name,option_value) values(?,?,?)";	     
		 int update=jdbcTemplate.update(Add_Options_SQL, ops.getOptionId(),ops.getOptionName(),ops.getOptionValue());	
		 
		 if(update==1) {
	      System.out.println("Options are Added");
	      
	}
*/
	

}
