package com.phillip.languages.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.phillip.languages.models.Language;
import com.phillip.languages.repositories.LanguageRepository;


@Service
public class LanguageService {
	private final LanguageRepository languageRepo;
	
	public LanguageService(LanguageRepository languageRepo) {
        this.languageRepo = languageRepo;
    }
	// returns all the languages
    public List<Language> allLanguages() {
        return languageRepo.findAll();
    }
    // creates a language
    public Language createLanguage(Language lang) {
        return languageRepo.save(lang);
    }
    // retrieves a language
    public Language findLanguage(Long id) {
        Optional<Language> optionalLang = languageRepo.findById(id);
        if(optionalLang.isPresent()) {
            return optionalLang.get();
        } else {
            return null;
        }
    }
    public void deleteLanguage(Long id) {
    	Optional<Language> optionalLang = languageRepo.findById(id);
        if(optionalLang.isPresent()) {
        	Language thisLang=optionalLang.get();
            languageRepo.delete(thisLang);
        } 
    }
 
    public Language updateLanguage(Language lang) {
    	Optional<Language> optionalLang = languageRepo.findById(lang.getId());
        if(optionalLang.isPresent()) {
        	Language thisLang = optionalLang.get();
        	thisLang.setName(lang.getName());
        	thisLang.setCreator(lang.getCreator());
        	thisLang.setVersion(lang.getVersion());
        	
        	return languageRepo.save(thisLang);
        	
        } else {
            return null;
        }
    }

}
