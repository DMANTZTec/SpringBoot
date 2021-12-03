package com.dmantz.dls.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.dmantz.dls.springboot.Repository.TraineeDAO;
import com.dmantz.dls.springboot.model.Course;

@RestController
public class TraineeController {
	@Autowired 
	private TraineeDAO tDAO;
	
	@GetMapping(path="trainee/courses")
	public List<Course> findAll() {
		return tDAO.viewAllCourses();
	}
		@GetMapping("trainee/courses/{id}")
		public Course findById(@PathVariable int id) {
			return tDAO.findById(id);
		}


}
