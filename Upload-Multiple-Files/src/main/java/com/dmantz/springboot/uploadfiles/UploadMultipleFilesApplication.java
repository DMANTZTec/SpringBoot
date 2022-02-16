package com.dmantz.springboot.uploadfiles;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dmantz.springboot.uploadfiles.service.FileStorageService.FilesStorageService;

@SpringBootApplication
public class UploadMultipleFilesApplication implements CommandLineRunner {
	  @Resource
	  FilesStorageService storageService;
	public static void main(String[] args) {
		SpringApplication.run(UploadMultipleFilesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		storageService.deleteAll();
	    storageService.init();
		
	}


}
