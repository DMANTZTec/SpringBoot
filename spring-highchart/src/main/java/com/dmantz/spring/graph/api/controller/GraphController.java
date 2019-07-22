package com.dmantz.spring.graph.api.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
//@RequestMapping(value="/home")
public class GraphController {
	
	@GetMapping("/displayBarGraph")
	public String barGraph(Model model) {	
		
		
		Map<String, Integer> map=new LinkedHashMap<>();
		
		map.put("java", 75);
		map.put("Net", 50);
		map.put("python", 30);
		map.put("PHP", 25);
		map.put("javascript",15);
		
		
		model.addAttribute("map", map);
		
		System.out.println("This is barGraph Controller :"+map);
		
		return "barGraph";
		
		
	}
	
	  @GetMapping("/displayPieChart")
     public String pieChart(Model model) {
		

			System.out.println("This is pieChart Controller :"+model);
		  
		model.addAttribute("pass", 70);
		model.addAttribute("fail", 30);
				
		return "pieChart";
		
		
	}
	
	
	

}
