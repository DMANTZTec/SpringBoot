package com.dmantz.JasperReportsWithSpringBoot.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;

import com.dmantz.Services.ProductService;


@Controller
@RequestMapping("product")
public class ProductController {
	
	@Autowired	
	private ProductService productService;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@RequestMapping(value="index",method=RequestMethod.GET)
	public String index() {
		
		return "products/index";
	}
	
	
	@RequestMapping(value="reports",method=RequestMethod.GET)
	public ModelAndView reports() {
		JasperReportsPdfView view=new JasperReportsPdfView();
		view.setUrl("classpath:/reports/reports.jrxml");
		view.setApplicationContext(applicationContext);
		
		Map<String, Object> params=new HashMap<String,Object>();
		params.put("datasource", productService.report());
		return new ModelAndView(view,params);		

	}
	
	
	
	
	
	

}
