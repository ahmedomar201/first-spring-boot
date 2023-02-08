package com.luv2code.springboot.demo.firstspringboot.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	 //inject properties team and coach
	
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	//expose the teaminfo
	@GetMapping("/teaminfo")
	
	public String getTeamInfo() {
		return "coach:" +coachName+"team:"+teamName;
	}
	
	
	
	
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
