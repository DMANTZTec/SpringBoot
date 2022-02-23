package com.dmantz.springboot.service;

import org.springframework.web.multipart.MultipartFile;

import com.dmantz.springboot.model.UploadedFile;

public interface FileUploadService {
	
	
	public void uploadToLocal(MultipartFile file);
	public UploadedFile uploadTodb(MultipartFile file);
	public UploadedFile downloadFile(String fileId);

}
