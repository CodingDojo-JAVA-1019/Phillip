package com.phillip.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.phillip.languages.models.Language;


@Repository
public interface LanguageRepository extends CrudRepository<Language,Long>{

	
	List<Language> findAll();
	Long countByCreatorContaining(String search);
	Long deleteByIdIs(Long Id);
		
}
