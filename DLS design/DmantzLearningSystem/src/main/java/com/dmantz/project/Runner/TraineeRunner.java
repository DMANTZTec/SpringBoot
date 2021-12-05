package com.dmantz.project.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dmantz.project.model.Trainee;
import com.dmantz.project.repository.CourseDao;
import com.dmantz.project.repository.TraineeDao;
@Component
public class TraineeRunner implements CommandLineRunner {
	
	@Autowired
	private JdbcTemplate jt;
	
	@Autowired
	private TraineeDao dao;
	
	private CourseDao cdao;
	
	
	@Override
	public void run(String... args) throws Exception {
		
	/*	dao.saveTrainee(new Trainee(2,"Amulya Madupoju","Nalgonda"));
		dao.saveTrainee(new Trainee(3,"Vamshi Bhairoju","Nalgonda"));
		dao.saveTrainee(new Trainee(4,"Naresh Chepuroju","Nalgonda"));
		dao.saveTrainee(new Trainee(5,"Mamatha Tekumatla","Nalgonda"));*/
		
		//dao.updateTraineeBy("Nalgonda",1,"swapna koyagura");
		
		
	}

}
