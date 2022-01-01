package com.dmantz.dls.springboot.Controller;

import java.util.List;
import com.dmantz.dls.springboot.model.Trainee_Course;
import com.dmantz.dls.springboot.model.Worklog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.dls.springboot.Repository.TraineeDAO;
import com.dmantz.dls.springboot.model.Course;
import com.dmantz.dls.springboot.model.Module;
@RestController
@RequestMapping("/api")
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
		
		
		 /*public List<Course> getAll();
		public MyCourse getById(int traineeId);
		public workLog viewWorklog(int traineeId);
		public List<Module> viewModules(int courseId);
		public int reportDailyProgress(workLog w);
		public int reportIssue(String issues,int taskId);
		public int addHoursTask(int hourSpent,int taskId);*/
		
	    @RequestMapping(value="/courses",method=RequestMethod.GET)
	    public List<Course> getCourses() {
			return tDAO.getAll();
		}
	    @RequestMapping(value="myCourse/{traineeId}",method=RequestMethod.GET)
	    public Trainee_Course getById(@PathVariable int traineeId)
	    {
			return tDAO.getById(traineeId);
	    	
	    }
	    @RequestMapping(value="worklog/{traineeId}",method=RequestMethod.GET)
	    public Worklog viewWorklog(@PathVariable int traineeId)
	    {
			return tDAO.viewWorklog(traineeId);
	    	
	    }
	    @RequestMapping(value="modules/{courseId}",method=RequestMethod.GET)
	    public List<Module> viewModules(@PathVariable int courseId)
	    {
			return tDAO.viewModules(courseId);
	    	
	    }
	    @RequestMapping(value="/dailyprogress",method=RequestMethod.POST)
	    public String reportDailyProgress(@RequestBody Worklog w)
	    {
	    	tDAO.reportDailyProgress(w);
			return w.taskId;
	    	
	    }
	   @PutMapping("/issues/{taskId}")
	   public String reportIssues(@RequestBody Worklog w,@PathVariable int taskId)
	   {
		   return tDAO.reportIssue(w, taskId)+w.taskId;
	   }
	   @PutMapping("/hours/{taskId}")
	   public String addHoursTask(@RequestBody Worklog w,@PathVariable int taskId)
	   {
		   return tDAO.addHoursTask(w, taskId)+w.taskId;
	   }
		
		
}

 
										