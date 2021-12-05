package com.dmantz.dls.springboot.Controller;

import java.util.List;
import com.dmantz.dls.springboot.model.Trainee_Course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.dmantz.dls.springboot.Repository.TraineeDAO;
import com.dmantz.dls.springboot.model.Course;
import com.dmantz.dls.springboot.model.Module;
@RestController
public class TraineeController {
	@Autowired 
	private TraineeDAO tDAO;
	
	@GetMapping(path="trainee/courses")
	public List<Course> findAll() {
		return tDAO.viewAllCourses();
	}
		@GetMapping("trainee/courses/{id}")
		public Course findByCourseId(@PathVariable int id) {
			return tDAO.findByCourseId(id);
		}
		
		@GetMapping("trainee/mycourses/{trainee_id}")
		public List<Trainee_Course> viewMyCourses (@PathVariable String trainee_id) {
			return tDAO.viewMyCourses(trainee_id);
		}
		
		@GetMapping("trainee/modules/{course_id}")
		public List<Module> viewMyModules (
				@PathVariable String course_id) {
			return tDAO.viewMyModules(course_id);

        }
		@GetMapping("trainee/tasks/{module_id}")
		public List<Module> viewMyTasks(@PathVariable String module_id ) {
			return tDAO.viewMyTasks( module_id);
		}
		//Inserting Data
		@PutMapping("/employees/{id}")
		public String update(@RequestBody Course c, @PathVariable int id) {
			return tDAO.update(c, id)+" Employee(s) updated successfully";
		}
		
}


