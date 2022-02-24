package com.dmantz.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dmantz.springboot.service.FileUploadService;

@RestController
//@RequestMapping("api/v1")
public class FileUploadController {
	
	
	@Autowired
	private FileUploadService fileUploadService;
	
	
	
	@PostMapping("/upload/local")
	
	public void uploadLocal(@RequestParam("file")MultipartFile multipartfile) {
		
		System.out.println("yes");
		 fileUploadService.uploadToLocal(multipartfile);
		
	}
	
	@PostMapping("/upload/db")
	public void uploadDb (@RequestParam("file") MultipartFile multipartfile) {
		
		fileUploadService.uploadTodb(multipartfile);
		
	}
	
	
	

}
