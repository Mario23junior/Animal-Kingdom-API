package com.project.AnimalKingdom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;

@Entity
public class Animal {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "{campo.nome.valid}")
	private String nome;
	
	@DecimalMin("1")
 	private Integer velocidade;
	
	@DecimalMin("1")
	private Double peso;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
        
	public Integer getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	
	
	
	
	
}
