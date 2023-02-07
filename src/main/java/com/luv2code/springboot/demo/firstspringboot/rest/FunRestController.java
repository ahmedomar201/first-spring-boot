package com.luv2code.springboot.demo.firstspringboot.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	//expose"/" that return hello
	
	@GetMapping("/")
	public String sayHello() {
		return "hello world time on server "+LocalDateTime.now();
	}
	
	//expose a new  endpoint for "workout" 
	
	@GetMapping("/workout")
	
	public String getDailyWorkout() {
		return "run ahard 5k! ";
	}
	
	
	//expose a new  endpoint for "fortine" 
	
		@GetMapping("/fortine")
		
		public String getDailyFortine() {
			return "tatki tatki tatki ! ";
		}
	 
 
	

}
