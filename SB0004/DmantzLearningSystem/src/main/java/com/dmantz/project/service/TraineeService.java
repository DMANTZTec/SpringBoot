package com.dmantz.project.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.dmantz.project.model.Course;
import com.dmantz.project.model.Trainee;

@Component
public class TraineeService {
	 
	private static List<Trainee> trainees= new ArrayList<>();
	
	static {
		Course course1 = new Course("1","Java","10 modules",Arrays.asList("Control statements","Class","interface","Constructors"));
		
		Course course2 = new Course("2","Spring","10 modules",Arrays.asList("Control statements","Class","interface","Constructors"));
		
		Course course3 = new Course("3","Angular","10 modules",Arrays.asList("Control statements","Class","interface","Constructors"));
		
		Course course4 = new Course("4","HTML","10 modules",Arrays.asList("Control statements","Class","interface","Constructors"));
		
		Trainee swapna = new Trainee("1","swapna koyagura","Nalgonda",new ArrayList<>(Arrays.asList(course1,course2,course3,course4)));
		
		Trainee Amulya = new Trainee("2","Amulya Madupoju","Nalgonda",new ArrayList<>(Arrays.asList(course1,course2,course3,course4)));
		
		trainees.add(swapna);
		trainees.add(Amulya);
		
	}
	public List<Trainee> retrieveAllTrainees() {
		return trainees;
	}
	public Trainee retrieveTrainee(String traineeId) {
		for (Trainee trainee : trainees) {
			if(trainee.getTraineeId().equals(traineeId)) {
				return trainee;
			}
			
		}
		return null;
		
		
	}
	
  public List<Course> retrieveCourses(String traineeId) {
	  Trainee trainee = retrieveTrainee(traineeId);
	  if(trainee == null) {
		  return null;
	  }
	  return trainee.getCourses();
  }
  public Course retrieveCourse(String traineeId, String courseId) {
	  Trainee trainee = retrieveTrainee(traineeId);

		if (trainee == null) {
			return null;
		}

		for (Course course : trainee.getCourses()) {
			if (course.getIndex().equals(courseId)) {
				return course;
			}
		}

		return null;
  }

}
