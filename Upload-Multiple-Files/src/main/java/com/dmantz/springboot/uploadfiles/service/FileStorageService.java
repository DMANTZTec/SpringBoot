package com.dmantz.springboot.uploadfiles.service;
import java.nio.file.Path;
import java.util.stream.Stream;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public class FileStorageService {
	
	
	public interface FilesStorageService {
	  public void init();
	  public void save(MultipartFile file);
	  public Resource load(String filename);
	  public void deleteAll();
	  public Stream<Path> loadAll();
	}

}
