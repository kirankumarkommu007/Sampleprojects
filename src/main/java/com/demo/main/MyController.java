package com.demo.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
  
	@GetMapping("/")
	public String getdata() {
		return "Hello World Good Evening!";
		
	}
	
	@PostMapping("/")
    public String postData(@RequestBody String name) {
        return "Good morning " + name;
    }
}
