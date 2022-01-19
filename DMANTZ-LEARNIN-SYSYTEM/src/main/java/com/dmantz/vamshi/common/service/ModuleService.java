package com.dmantz.vamshi.common.service;

import java.util.List;

import com.dmantz.vamshi.common.entity.Module;


public interface ModuleService {
	public List<Module> findBycourseId(int CourseId);

}
