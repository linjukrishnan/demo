package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ResponseEntity<?> welcome() throws Exception {
		return ResponseEntity.ok("Welcome to Demo World");
	}
}
