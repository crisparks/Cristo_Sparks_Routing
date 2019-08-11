package com.sparks.firstproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	//path variables are part of the url instead of being simply attached. you define each part of the path variable for example. index/m/23/101/txsr
	@RequestMapping("/d/{location}")
    public String showLesson(@PathVariable("location") String location){
    	if(location.equals("dojo")) {
    		return "The dojo is awesome!";
    	}
    	else if(location.equals("burbank-dojo")) {
    		return "Burbank Dojo is located in Southern California.";
    	}
    	else if(location.equals("san-jose")) {
    		return "SJ dojo is the headquarters.";
    	}
    	return "Dojo not found.";
    }
}
