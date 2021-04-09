package com.project.AnimalKingdom.ControllerTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import com.project.AnimalKingdom.repositorys.AnimalRepository;

public class AnimalControllerTest {
   
	@Autowired
	MockMvc mvc;
	
	@Autowired
	AnimalRepository animalRepository;
}
