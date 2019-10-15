package com.phillip.dojos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.phillip.dojos.models.Dojo;
import com.phillip.dojos.models.Ninja;
import com.phillip.dojos.services.AppService;

@Controller
public class AppController {

	private final AppService aServ;
	
	public AppController(AppService aServ) {
		this.aServ=aServ;
	}
	@GetMapping("/")
	public String home(Model model) {
		List<Dojo> dojos=aServ.findAllDojos();
		List<Ninja> ninjas = aServ.findAllNinjas();
		model.addAttribute("dojos", dojos);
		model.addAttribute("ninjas", ninjas);
		return "/home.jsp";
	}
	@GetMapping("/dojos/new")
	public String newDojoForm(@ModelAttribute("dojo")Dojo dojo) {
		return "/createDojo.jsp";
	}
	@PostMapping("/dojos/create")
	public String createDojo(@Valid @ModelAttribute("dojo")Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "/createDojo.jsp";
		}else {
			aServ.createDojo(dojo);
			return "redirect:/";
		}
	}
	
	@GetMapping("/ninjas/new")
	public String newNinjaForm(@ModelAttribute("ninja")Ninja ninja, Model model, @ModelAttribute("dojo")Dojo dojo) {
		List<Dojo> dojos=aServ.findAllDojos();
		model.addAttribute("dojo", dojos);
		return "/createNinja.jsp";
	}
	@PostMapping("/ninjas/create")
	public String createNinja(@Valid @ModelAttribute("ninja")Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "/createNinja.jsp";
		}else {
			aServ.createNinja(ninja);
			return "redirect:/";
		}
	}
	
}
