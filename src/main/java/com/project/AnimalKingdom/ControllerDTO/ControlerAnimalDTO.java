package com.project.AnimalKingdom.ControllerDTO;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.AnimalKingdom.ModelDTO.AnimalDTO;
import com.project.AnimalKingdom.Service.ServiceDTOInplements;
import com.project.AnimalKingdom.Service.ImplementsDTO.implementsDTO;

@RestController
@RequestMapping("/api/listall")
public class ControlerAnimalDTO {
       
	private  ServiceDTOInplements listAll;
	
	public ControlerAnimalDTO(implementsDTO listAll) {
		this.listAll = listAll;
	}
	
	@GetMapping("/data")
	public List<AnimalDTO> listAllData() {
		List<AnimalDTO> informa = listAll.listAll();
		return informa;
	}
}