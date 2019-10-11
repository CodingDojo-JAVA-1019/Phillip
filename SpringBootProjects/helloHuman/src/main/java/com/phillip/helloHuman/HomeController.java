package com.phillip.helloHuman;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller


public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("name", "Burbank");
		return "index.jsp";
	}
}
