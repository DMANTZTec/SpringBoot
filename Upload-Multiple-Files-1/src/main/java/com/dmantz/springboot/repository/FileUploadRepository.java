package com.dmantz.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dmantz.springboot.model.UploadedFile;


@Repository
public interface FileUploadRepository extends JpaRepository<UploadedFile,String> {
	

}
