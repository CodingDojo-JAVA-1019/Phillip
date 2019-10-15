package com.phillip.dojos.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.phillip.dojos.models.Dojo;
import com.phillip.dojos.models.Ninja;
import com.phillip.dojos.repositories.DojoRepository;
import com.phillip.dojos.repositories.NinjaRepository;

@Service
public class AppService {
	private final DojoRepository dRepo;
	private final NinjaRepository nRepo;
	
	public AppService(DojoRepository dRepo, NinjaRepository nRepo) {
		this.dRepo = dRepo;
		this.nRepo = nRepo;
	}
	
	public Dojo createDojo(Dojo dojo) {
		return dRepo.save(dojo);
	}
	public Ninja createNinja(Ninja ninja) {
		return nRepo.save(ninja);
		
	}
	public Dojo findDojo(Long id) {
		return dRepo.findByIdIs(id);
	}
	
	public List<Ninja> findAllNinjas(){
		return nRepo.findAll();
	}
	public List<Dojo> findAllDojos(){
		return dRepo.findAll();
	}
	
}
