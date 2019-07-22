package com.dmantz.techworklog.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dmantz.techworklog.model.User;

@Service
public interface SpringReadFileService {
	
	
	List<User> findAll();

	boolean saveDataFromUploadfile(MultipartFile file);
	
	
	
	

}
