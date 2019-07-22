package com.dmantz.EcommerceApplicationController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dmantz.EcommerceApplicationDAO.OptionsDao;
import com.dmantz.EcommerceApplicationDAOImpl.OptionsRowMapper;
import com.dmantz.EcommerceApplicationDAOImpl.ProductRowMapper;
import com.dmantz.EcommerceApplicationModel.Options;


@RestController
@RequestMapping("/options")
public class OptionsController {
	
	@Autowired
	private OptionsDao optionsDao;
		
	@RequestMapping(value="/addAllOptions")
	public void addAllOptions(@RequestBody(required=true)@Valid List<Options> options ) {
				
		optionsDao.addAllOptions(options);
				
		System.out.println("Options are Added Successfully");
		
	}
	
	@RequestMapping(value="/getAllProducts")
	public void getAllProducts() {
		
		List<ProductRowMapper> pds=optionsDao.getAllProducts();
		System.out.println(pds);
	}
	
	
	
	
	

}
