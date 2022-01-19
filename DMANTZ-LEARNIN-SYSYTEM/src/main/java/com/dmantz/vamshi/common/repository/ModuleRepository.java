package com.dmantz.vamshi.common.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmantz.vamshi.common.entity.Module;

public interface ModuleRepository extends JpaRepository<Module,Integer>
{
	List<Module> findByCourseId(int  courseId);


}
