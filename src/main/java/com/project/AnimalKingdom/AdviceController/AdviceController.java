package com.project.AnimalKingdom.AdviceController;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AdviceController {
   
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public Errors handleMethodNotValidException(MethodArgumentNotValidException ex) {
		List<String> Result = ex.getBindingResult().getAllErrors()
		            .stream()
		            .map(erro -> erro.getDefaultMessage())
		            .collect(Collectors.toList());
		 return new Errors(Result);
	}
}
