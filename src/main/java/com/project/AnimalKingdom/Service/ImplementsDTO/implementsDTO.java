package com.project.AnimalKingdom.Service.ImplementsDTO;

import java.util.List;
import java.util.stream.Collectors;

import com.project.AnimalKingdom.ModelDTO.AnimalDTO;
import com.project.AnimalKingdom.Service.ServiceDTOInplements;
import com.project.AnimalKingdom.model.Animal;
import com.project.AnimalKingdom.model.ComplementInforma;
import com.project.AnimalKingdom.repositorys.AnimalRepository;

public class implementsDTO implements ServiceDTOInplements {
    
	private AnimalRepository animalRepository;
	
	public implementsDTO(AnimalRepository animalRepository) {
       this.animalRepository = animalRepository;
	}
	
	@Override
	public List<AnimalDTO> listAll() {
 		return ((List<Animal>)
 				    animalRepository
 				     .findAll())
 				     .stream()
 				     .map(this::converterAnimalImplementDTO)
 				     .collect(Collectors.toList());
 				
	}
	             
	public AnimalDTO converterAnimalImplementDTO(Animal animal) {
         
		 AnimalDTO dtoAnimal = new AnimalDTO();
		 dtoAnimal.setId(animal.getId());
		 dtoAnimal.setNome(animal.getNome());
		 dtoAnimal.setPeso(animal.getPeso());
		 dtoAnimal.setVelocidade(animal.getVelocidade());
		 
		 ComplementInforma complementInforma = animal.getComplementInforma();
		 dtoAnimal.setNomeCientifico(complementInforma.getNomeCientifico());
		 dtoAnimal.setAltura(complementInforma.getAltura());
		 dtoAnimal.setComprimento(complementInforma.getComprimento());
		 dtoAnimal.setExpectativaDeVida(complementInforma.getExpectativaDeVida());
		 dtoAnimal.setPeriodoDeGestacao(complementInforma.getPeriodoDeGestacao());
		 
		 return dtoAnimal;
		 
		 
 	}
}
