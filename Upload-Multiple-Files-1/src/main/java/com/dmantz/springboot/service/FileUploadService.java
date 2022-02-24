package com.dmantz.springboot.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {
	
	
	public void uploadToLocal(MultipartFile file);
	
	public void uploadTodb(MultipartFile file);
}
