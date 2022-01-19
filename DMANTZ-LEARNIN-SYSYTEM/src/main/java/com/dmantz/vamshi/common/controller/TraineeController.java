package com.dmantz.vamshi.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.vamshi.common.entity.TraineeCourses;
import com.dmantz.vamshi.common.entity.TraineeCoursesDetail;
import com.dmantz.vamshi.common.service.MyCoursesDetailService;
import com.dmantz.vamshi.common.service.MyCoursesService;

@RestController
@RequestMapping("/trainee")
public class TraineeController {

	@Autowired
	MyCoursesService myCoursesService;

	@RequestMapping(value = "mycourses/{traineeId}", method = RequestMethod.GET)
	public List<TraineeCourses> findByTraineeId(@PathVariable int traineeId) {
		List<TraineeCourses> myCourselist = myCoursesService.findByTraineeId(traineeId);

		return myCourselist;
	}

	@Autowired
	MyCoursesDetailService myCoursesDetailService;

	@RequestMapping(value = "mycoursesdetail/{traineeId}", method = RequestMethod.GET)
	public List<TraineeCoursesDetail> findBytraineeId(@PathVariable int traineeId) {
		List<TraineeCoursesDetail> myCoursesDetail = myCoursesDetailService.findByTraineeId(traineeId);
		return myCoursesDetail;

	}

}
