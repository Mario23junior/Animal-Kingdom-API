package com.project.AnimalKingdom.Controller.DocController;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.AnimalKingdom.model.Animal;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

public interface DocControllerAnimal {
   
	@ApiOperation(value = "Salvando animais no banco de dados")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "sucesso"),
			@ApiResponse(code = 500, message = "erro ao salvar dados")
			
	})
	public Animal save(@RequestBody @Valid Animal animal);
	
	
	@ApiOperation(value = "Buscando dados dos animais por id")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "sucesso"),
			@ApiResponse(code = 404, message = "nenhuma informação foi em encontrada")
			
	})
	public Animal find(@PathVariable Long id);
	
	
	@ApiOperation(value = "Deletando dados de animais")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "sucesso"),
			@ApiResponse(code = 404, message = "nenhuma informação foi em encontrada para ser deletada")
			
	})
	public void delete(@PathVariable Long id);
	
	
	@ApiOperation(value = "Atualizando dados")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "sucesso"),
			@ApiResponse(code = 500, message = "não foi possivel atualizar informação")
			
	})
	public void update(@PathVariable Long id, @Valid @RequestBody Animal animal);

}

















