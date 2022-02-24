package com.dmantz.springboot.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dmantz.springboot.model.UploadedFile;
import com.dmantz.springboot.repository.FileUploadRepository;

@Service
public class FileUploadServiceImpl implements FileUploadService{

	private String uploadFolderPath="C:\\Users\\ADMIN_4\\Desktop\\MultiPartFile\\";
	
	
	@Autowired
	FileUploadRepository fileUploadRepository;
	
	@Override
	public void uploadToLocal(MultipartFile file) {
		

      try {
    	  
		byte[] data=file.getBytes();
		Path path=Paths.get(uploadFolderPath + file.getOriginalFilename());
		Files.write(path,data);
		
		System.out.println("yes");
		
		
		
	} 
      catch (IOException e) {
		
		e.printStackTrace();
		
	}
	}
 
  		
  		

	@Override
	public void uploadTodb(MultipartFile file) {
		UploadedFile uploadedFile=new UploadedFile();
  		try {
  			uploadedFile.setFileData(file.getBytes());
  			uploadedFile.setFileType(file.getContentType());
  			uploadedFile.setFileName(file.getOriginalFilename());
  			fileUploadRepository.save(uploadedFile); 
  			System.out.println("Successfull");
  			
  		} catch (IOException e) {
  			
  			e.printStackTrace();
  		}
  		
  	}		
			
	}


