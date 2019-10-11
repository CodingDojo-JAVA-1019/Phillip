package com.phillip.strings;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tennis")
public class HomeController {

	
	@RequestMapping("")
	public String hello() {
		return "Hello client!  How are you?";
		
	}
	@RequestMapping("/random")
	public String secondURL() {
		return "Spring Boot is great!  Way better than the bullshit servlets we were just doing.";
		
	}
	@RequestMapping("/search")
		public String indexSearch(@RequestParam(value="q", required=false)String searchQuery) {
		
		if(searchQuery == null) {
			return "You searched for: nothing";
		}else {
			return "You searched for: "+searchQuery;
		}
	}
	@RequestMapping("/m/{track}/{module}/{lesson}")
		public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson) {
		return "Track: "+track+", Module: "+module+", Lesson: "+lesson;
	}

}
