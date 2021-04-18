package com.project.AnimalKingdom.Service;

import java.util.List;

import com.project.AnimalKingdom.ModelDTO.AnimalDTO;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@ApiOperation(value = "Listando dados de exibiçãoes pertinentes ao usuario final ")
@ApiResponses(value = { 
		@ApiResponse(code = 200, message = "sucesso"),
		@ApiResponse(code = 404, message = "nenhuma informacao foi encontrada")
		
})
public interface ServiceDTOInplements {
    
	List<AnimalDTO> listAll();
}
