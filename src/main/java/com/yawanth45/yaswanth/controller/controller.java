package com.yawanth45.yaswanth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controller {
	@GetMapping("/display")
	public ResponseEntity<String> getDisplayContent(){
		return ResponseEntity.status(HttpStatus.OK).body("I am Yaswanth sai");
	}
	@GetMapping("/yas")
	public ResponseEntity<String> getDisplayContentsak(){
		return ResponseEntity.status(HttpStatus.OK).body("This is a Project");
	}

}
