package com.project.AnimalKingdom.Controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.project.AnimalKingdom.model.Animal;
import com.project.AnimalKingdom.repositorys.AnimalRepository;

@RestController
@RequestMapping("animal/data")
public class AnimalController {
    
	AnimalRepository animalRepository;
	
	public AnimalController(AnimalRepository animalRepository) {
		 this.animalRepository = animalRepository;
	}
	
	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public Animal save(@RequestBody @Valid Animal animal) {
		return animalRepository.save(animal);
	}
	
	
	@GetMapping("/{id}")
	public Animal find(@PathVariable Long id) {
		return animalRepository
		           .findById(id)
		           .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Nenhun usuarios encontrado"));
		 
	}
	
	
	
}
