package com.hello.be.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class HelloWorldController {

	@GetMapping("/hello")
	public ResponseEntity<Object> index() {
		HashMap<String, String> map = new HashMap<>();
		map.put("message", "hello world");
		return ResponseEntity.status(HttpStatus.OK).body(map);
	}

}