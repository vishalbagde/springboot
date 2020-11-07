package com.spring.boot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.spring.boot.helper.FileUploadHelper;

@RestController
public class FileUploadController {

	@Autowired
	FileUploadHelper fileHelper;

	@PostMapping("/upload-file")
	ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
		if (file.isEmpty()) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("empty file or file not Found");
		}

		try {

			return fileHelper.uploadFile(file);
		} catch (Exception e) {
			System.out.println(e.getStackTrace().toString());
		}

		return ResponseEntity.ok("working");
	}

}
