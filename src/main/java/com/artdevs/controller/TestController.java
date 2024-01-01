package com.artdevs.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/")
	public ResponseEntity<String> getFirst(){
		return ResponseEntity.ok("Seccussfully !");
	}
}
