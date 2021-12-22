package com.dmantz.vamshi.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.vamshi.springboot.common.model.Course;
import com.dmantz.vamshi.springboot.common.model.MyCourse;
import com.dmantz.vamshi.springboot.repository.traineeDao;

@RestController
public class traineeController {
    @Autowired
	private traineeDao tDao;
    @GetMapping("/course")
    public List<Course> getAll() {
		return tDao.getAll();
	}
    @GetMapping("/mycourse/{trainee_id}")
    public MyCourse getById(@PathVariable int traineeId)
    {
		return tDao.getById(traineeId);
    	
    }
	
}
