package com.dmantz.vamshi.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.vamshi.springboot.common.model.Course;
import com.dmantz.vamshi.springboot.common.model.MyCourse;
import com.dmantz.vamshi.springboot.common.model.Task;
import com.dmantz.vamshi.springboot.common.model.Worklog;
import com.dmantz.vamshi.springboot.repository.TraineeDao;

@RestController
public class TraineeController {
    @Autowired
	private TraineeDao tDao;
    /*public List<Course> getAll();
	public MyCourse getById(int traineeId);
	public workLog viewWorklog(int traineeId);
	public List<Module> viewModules(int courseId);
	public int reportDailyProgress(workLog w);
	public int reportIssue(String issues,int taskId);
	public int addHoursTask(int hourSpent,int taskId);*/
	
    @RequestMapping(value="/courses",method=RequestMethod.GET)
    public List<Course> getCourses() {
		return tDao.getAll();
	}
    @RequestMapping(value="myCourse/{traineeId}",method=RequestMethod.GET)
    public MyCourse getById(@PathVariable int traineeId)
    {
		return tDao.getById(traineeId);
    	
    }
    @RequestMapping(value="worklog/{traineeId}",method=RequestMethod.GET)
    public Worklog viewWorklog(@PathVariable int traineeId)
    {
		return tDao.viewWorklog(traineeId);
    	
    }
    @RequestMapping(value="modules/{courseId}",method=RequestMethod.GET)
    public List<Module> viewModules(@PathVariable int courseId)
    {
		return tDao.viewModules(courseId);
    	
    }
    @RequestMapping(value="/dailyprogress",method=RequestMethod.POST)
    public int reportDailyProgress(@RequestBody Worklog w)
    {
    	tDao.reportDailyProgress(w);
		return w.taskId;
    	
    }
   @PutMapping("/issues/{taskId}")
   public int reportIssues(@RequestBody Worklog w,@PathVariable int taskId)
   {
	   return tDao.reportIssue(w, taskId)+w.taskId;
   }
   @PutMapping("/hours/{taskId}")
   public int addHoursTask(@RequestBody Worklog w,@PathVariable int taskId)
   {
	   return tDao.addHoursTask(w, taskId)+w.taskId;
   }
	
}
