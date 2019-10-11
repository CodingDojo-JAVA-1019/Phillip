package com.phillip.displayDate;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class HomeController {
	 
	@RequestMapping("/")
	public String home(Model model, HttpSession session) {
		session.setAttribute("code", "bushido");
		return "index.jsp";
	}
	
	@RequestMapping("/code_check")
	public String codeCheck( HttpSession session, RedirectAttributes redirectAttributes, @RequestParam(value="code")String code) {
		Object check = session.getAttribute("code");
		System.out.println(check.toString()+" "+ code.toString());
		if (check.toString().equals(code)) {
			return "code.jsp";
		}
		else {
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
			
		}
	
	}
	
}
