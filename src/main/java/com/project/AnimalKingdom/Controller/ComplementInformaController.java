package com.project.AnimalKingdom.Controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.project.AnimalKingdom.Controller.DocControllerComplementInfo.DocControllerComplementInfo;
import com.project.AnimalKingdom.model.ComplementInforma;
import com.project.AnimalKingdom.repositorys.ComplementInformaRepository;

@RestController
@RequestMapping("info/comple")
public class ComplementInformaController implements DocControllerComplementInfo{
    
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
   
   @DeleteMapping("/{id}")
   @ResponseStatus(HttpStatus.NO_CONTENT)
   public void delete(@PathVariable Long id) {
	   complementInformaRepository
	                 .findById(id)
	                 .map(delete -> {
	                	 complementInformaRepository.deleteById(id);
	                	 return delete;
	                 }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"informaçaões não encontrados para deletação"));
   }
   
   
   @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody ComplementInforma compleInfo) {
	   complementInformaRepository
	                       .findById(id)
	                       .map(deleteData -> {
	                    	   compleInfo.setId(deleteData.getId());
	                    	   complementInformaRepository.save(compleInfo);
	                    	   return deleteData;
	                       }).orElseThrow( () -> new ResponseStatusException(HttpStatus.NO_CONTENT,"informacoes nao encontradas"));
       } 
 }
