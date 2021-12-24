package com.dmantz.dls.springboot.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.dmantz.dls.springboot.Repository.SupervisorDAO;
import com.dmantz.dls.springboot.model.Course;

@RestController
public class SupervisorController {
	@Autowired 
	private SupervisorDAO sDAO;
	
	@GetMapping(path="/trainee/courses/{courseId}")
	public Course viewCourseProgress(@PathVariable int courseId) {
		return sDAO.viewCourseProgress(courseId);
	}
	
	
	

}
