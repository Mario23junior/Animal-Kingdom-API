package com.project.AnimalKingdom.AdviceController;

import java.util.Arrays;
import java.util.List;

public class Errors {
    
	private List<String> erros;
	
	public Errors(String message) {
		this.erros = Arrays.asList(message);
 	}
	
	public Errors(List<String> erros) {
		 this.erros = erros;
	}

	public List<String> getErros() {
		return erros;
	}

	public void setErros(List<String> erros) {
		this.erros = erros;
	}
	
	
}
