package com.project.AnimalKingdom.Controller.DocControllerComplementInfo;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;

import com.project.AnimalKingdom.model.ComplementInforma;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

public interface DocControllerComplementInfo {
    
	
	@ApiOperation(value = "Salvando animais no banco de dados")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "sucesso"),
			@ApiResponse(code = 500, message = "erro ao salvar dados")
			
	})
	   public ComplementInforma save(@RequestBody @Valid ComplementInforma complementInforma);
}
