package com.demo.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
  
	@GetMapping("/")
	public String getdata() {
		return "Hello World Good Evening!";
		
	}
}
