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
import com.dmantz.springboot.response.FileUploadResponse;

@Service
public class FileUploadServiceImpl implements FileUploadService{

	private String uploadFolderPath="C:\\Users\\ADMIN_2\\Desktop\\code1\\";
	
	@Autowired
	private FileUploadRepository fileUploadRepository;
	
	@Override
	public void uploadToLocal(MultipartFile file) {

      try {
		byte[] data=file.getBytes();
		Path path=Paths.get(uploadFolderPath + file.getOriginalFilename());
		Files.write(path,data);
		
		
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
      
		
	}

	@Override
	public UploadedFile uploadTodb(MultipartFile file) {
		
		UploadedFile uploadedFile=new UploadedFile();
		try {
			uploadedFile.setFileData(file.getBytes());
			uploadedFile.setFileType(file.getContentType());
			uploadedFile.setFileName(file.getOriginalFilename());
			UploadedFile uploadedFileToRet = fileUploadRepository.save(uploadedFile); 
			System.out.println("object allowed");
			return uploadedFileToRet;
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public UploadedFile downloadFile(String fileId) {
		
		UploadedFile uploadedFileToRet = fileUploadRepository.getOne(fileId);
		
		return uploadedFileToRet;
	}

}
