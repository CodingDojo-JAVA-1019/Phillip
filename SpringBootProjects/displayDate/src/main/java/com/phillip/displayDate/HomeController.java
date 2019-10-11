package com.phillip.displayDate;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class HomeController {
	 
	@RequestMapping(value="/")
	public String home() {
		
		return "index.jsp";
	}
	
	@RequestMapping(value="/survey", method=RequestMethod.POST)
	public String survey(Model model, HttpSession session, RedirectAttributes redirectAttributes, @RequestParam(value="name")String name , @RequestParam(value="location")String location , @RequestParam(value="language")String language , @RequestParam(value="comments")String comments) {
		
		System.out.println(name+" "+location+" "+language+" "+comments);
		model.addAttribute("name",name);
		model.addAttribute("location",location);
		model.addAttribute("language",language);
		model.addAttribute("comments",comments);
		return "survey.jsp";
			
	}
	
}
	

