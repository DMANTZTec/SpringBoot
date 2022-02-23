package com.dmantz.springboot.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.dmantz.springboot.model.UploadedFile;
import com.dmantz.springboot.response.FileUploadResponse;
import com.dmantz.springboot.service.FileUploadService;

@RestController
@RequestMapping("api/v1")
public class FileUploadController {
	
	@Autowired
	private FileUploadService fileUploadService;
	
	@PostMapping("/upload/local")
	public void uploadLocal(@RequestParam("file")MultipartFile multipartfile) {
		
		 fileUploadService.uploadToLocal(multipartfile);
		
	}
	
	@PostMapping("/upload/db")
	public  FileUploadResponse uploaddb (@RequestParam("file") MultipartFile multipartfile) {
		
		UploadedFile uploadedFile=fileUploadService.uploadTodb(multipartfile);
		FileUploadResponse response= new FileUploadResponse();
		if(uploadedFile!=null) {
			String downloadUrl = ServletUriComponentsBuilder.fromCurrentContextPath()
					.path("/api/v1/download")
					.path(uploadedFile.getFileId())
					.toUriString();
			response.setDownloadUrl(downloadUrl);
			response.setFileId(uploadedFile.getFileId());
			response.setFileType(uploadedFile.getFileType());
			response.setUploadStatus(true);
			response.setMessage("File Uploaded Successfully");
			return response;
			
			
		}
		response.setMessage("Oops 1 something went wrong please re-upload");
		
		return response;
		
		
		
	}
	@GetMapping("/download/{fileId}")
	public ResponseEntity<Resource> downloadFile(@PathVariable String fileId) {
		
		UploadedFile uploadedFileToRet = fileUploadService.downloadFile(fileId);
		return ResponseEntity.ok()
				.contentType(MediaType.parseMediaType(uploadedFileToRet.getFileType()))
				.header(HttpHeaders.CONTENT_DISPOSITION,"attachment: filename" + uploadedFileToRet.getFileName())
				.body(new ByteArrayResource(uploadedFileToRet.getFileData()));
				
	}
	
	
	

}
