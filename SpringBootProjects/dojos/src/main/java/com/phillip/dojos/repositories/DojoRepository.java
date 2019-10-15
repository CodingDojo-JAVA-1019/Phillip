package com.phillip.dojos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.phillip.dojos.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {
	
	Dojo findByIdIs(Long id);
	List<Dojo> findAll();
	
}
