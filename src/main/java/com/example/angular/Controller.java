package com.example.angular;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@GetMapping( "/mass")
	public String Hello() {
		
		return "AHelloo AAzureee";
	}
	
	@RequestMapping("/a")
	public String Hello2() {
		return "Ram is ";
	}
	
}
