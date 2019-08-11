package com.sparks.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

//Class mapping will add the mapping "/index" to the entire class. E.g. for the random method, ".../index/random"
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
	public String greetings() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping("/python")
	public String python() {
		return "Python/Django was awesome!";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "Java/Spring is better!";
	}
		
}
