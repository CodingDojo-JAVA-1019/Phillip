package com.phillip.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.phillip.languages.models.Language;
import com.phillip.languages.services.LanguageService;


@Controller
public class LanguagesController {
private final LanguageService langService;
    
    public LanguagesController(LanguageService langService) {
        this.langService = langService;
    }

    @RequestMapping(value="/")
    public String index(Model model, @ModelAttribute("language") Language language) {
        List<Language> languages = langService.allLanguages();
        model.addAttribute("languages", languages);
        return "/languages/index.jsp";
    }
    
    @RequestMapping(value="/language", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("languages") Language language, BindingResult result) {
        if (result.hasErrors()) {
        	return "redirect:/";
        } else {
            langService.createLanguage(language);
            return "redirect:/";
        }
    }
    @RequestMapping("/languages/show/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
    	Language language = langService.findLanguage(id);
        model.addAttribute("language", language);
        return "languages/show.jsp";
    }
    @RequestMapping("/languages/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
    	Language language = langService.findLanguage(id);
        model.addAttribute("language", language);
        return "/languages/edit.jsp";
    }
    
    @RequestMapping(value="/languages/edit/{id}", method=RequestMethod.POST)
    public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "/languages/edit.jsp";
        } else {
            langService.updateLanguage(language);
            return "redirect:/";
        }
    }
    @RequestMapping(value="/languages/delete/{id}", method=RequestMethod.GET)
    public String destroy(@PathVariable("id") Long id) {
        langService.deleteLanguage(id);
        return "redirect:/";
    }
}
