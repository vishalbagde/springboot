package com.spring.boot.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.Servlet;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sun.xml.bind.api.impl.NameConverter.Standard;

@Component
public class FileUploadHelper {
	
	
	
	
	public FileUploadHelper() throws IOException {
		
	}
	public final String UPLOAD_DIR="C:\\java-practice\\springboot\\src\\main\\resources\\static\\image";
	//public final String UPLOAD_DIR="C:\\java-practice\\springboot\\src\\main\\resources\\static\\image";
	
	public final String UPLOAD_DIR1=new ClassPathResource("static/image").getFile().getAbsolutePath().toString();
	
	public ResponseEntity<String> uploadFile(MultipartFile file)
	{
		boolean f=false;
		try
		{
			InputStream is = file.getInputStream();	
			byte data[]=new byte[is.available()];
			is.read(data);
			String uploadloc=UPLOAD_DIR1+"\\"+file.getOriginalFilename();
			FileOutputStream fos=new FileOutputStream(uploadloc);
			fos.write(data);
			fos.flush();
			fos.close();
			f=true;
			if(f)
			{
				System.out.println("upload success");
				return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/image/").path(file.getOriginalFilename()).toUriString());
			}
			
			
			//Files.copy(file.getInputStream(),Paths.get(UPLOAD_DIR+File.separator+file.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
			
		}catch(Exception e)
		{
			System.out.println(e.getStackTrace().toString());
		}
		
		return ResponseEntity.ok("Upload file error");
	}

}
