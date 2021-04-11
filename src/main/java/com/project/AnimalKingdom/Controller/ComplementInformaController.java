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

import com.project.AnimalKingdom.model.ComplementInforma;
import com.project.AnimalKingdom.repositorys.ComplementInformaRepository;

@RestController
@RequestMapping("info/comple")
public class ComplementInformaController {
    
   ComplementInformaRepository complementInformaRepository;
   
   public ComplementInformaController(ComplementInformaRepository complementInformaRepository) {
	    this.complementInformaRepository = complementInformaRepository;
   }
   
   @PostMapping("/")
   @ResponseStatus(HttpStatus.CREATED)
   public ComplementInforma save(@RequestBody @Valid ComplementInforma complementInforma) {
	   return complementInformaRepository.save(complementInforma);
   }
   
   @GetMapping("/{id}")
    public ComplementInforma findId(@PathVariable Long id) {
	   return complementInformaRepository 
			     .findById(id)
			     .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Informação não encontrada"));
   }
   
}
