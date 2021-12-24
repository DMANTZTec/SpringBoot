package com.dmantz.dls.springboot.Controller;

import java.util.List;
import com.dmantz.dls.springboot.model.Trainee_Course;
import com.dmantz.dls.springboot.model.Worklog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.dls.springboot.Repository.TraineeDAO;
import com.dmantz.dls.springboot.model.Course;
import com.dmantz.dls.springboot.model.Module;
@RestController
public class TraineeController {
	@Autowired 
	private TraineeDAO tDAO;
	
	@GetMapping(path="/trainee/courses")
	public List<Course> viewAllCourses() {
		return tDAO.viewAllCourses();
	}
		@GetMapping("/trainee/courses/{id}")
		public Course findByCourseId(@PathVariable int id) {
			return tDAO.findByCourseId(id);
		}
		
		@GetMapping("/trainee/mycourses/{traineeId}")
		public List<Trainee_Course> viewMyCourses (@PathVariable int traineeId) {
			return tDAO.viewMyCourses( traineeId);
		}
		
		@GetMapping("/trainee/modules/{courseId}")
		public List<Module> viewMyModules (@PathVariable int courseId) {
			return tDAO.viewMyModules( courseId);

        }
		@GetMapping("/trainee/tasks/{moduleId}")
		public List<Module> viewMyTasks(@PathVariable int moduleId ) {
			return tDAO.viewMyTasks( moduleId);
		}
		//Inserting Data
		@PostMapping("/trainee/courses/addcourse")
		public String save(@RequestBody Course c) {
			
			System.out.println("Course Id: " + c.getCourseId());
			tDAO.save(c);
			return  c.getCourseId() + " saved successfully";
		}
		
		//enter into worklog
		@PostMapping("/myworklog")
		public String save(@RequestBody Worklog w) {
			
			System.out.println("Task Id: " + w.getTaskId());
			tDAO.save(w);
			return  w.getTaskId() + " saved successfully";
		}
		
		
}

 
										