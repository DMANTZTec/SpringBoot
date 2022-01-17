package com.dmantz.vamshi.commom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.vamshi.commom.entity.ListOfCourses;
import com.dmantz.vamshi.commom.service.ListOfCoursesService;

@RestController
@RequestMapping("/listofcourse")
public class ListOfCoursesController {
	@Autowired
	ListOfCoursesService listOfCoursesService;
	@GetMapping("/list")
	public List<ListOfCourses> findAll(){
		List<ListOfCourses> courseslist = listOfCoursesService.findAll();
		return courseslist;
	}

}
