package com.dmantz.vamshi.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmantz.vamshi.common.entity.Module;
import com.dmantz.vamshi.common.repository.ModuleRepository;

@Service
public class ModuleServiceImpl implements ModuleService {
	@Autowired
	ModuleRepository moduleRepository;

	@Override
	public List<Module> findBycourseId(int CourseId) {
		// TODO Auto-generated method stub
		List<Module> modules=moduleRepository.findByCourseId(CourseId);
		return modules;
	}

}
