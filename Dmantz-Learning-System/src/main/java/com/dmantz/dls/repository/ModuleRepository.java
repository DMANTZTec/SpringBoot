package com.dmantz.dls.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmantz.dls.entity.Module;

public interface ModuleRepository extends JpaRepository<Module,Integer> {

}
