package com.zensar.webapp.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Writing test case for every piece of business code including spring controller is mandate
@RestController
public class HelloRestController {

	@GetMapping("/Hello")
	public String getmessage() {
		return "Welcome to Devops";
	}

	@PostMapping("/greet")
	public ResponseEntity<String> createMessage(@RequestBody String msg) {
		return new ResponseEntity<>("Message Created " + msg, HttpStatus.CREATED);
	}
}
