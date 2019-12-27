package com.veera.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
	
	@GetMapping("/hello")
	public String printName() {
		
		return "Hello Veera Boddu..!!";
	}

}
