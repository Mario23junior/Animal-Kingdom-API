package com.project.AnimalKingdom.ModelDTO;

import java.util.List;

public class AnimalDTO {
    
	private Long id;
	private String nome;
 	private Integer velocidade;
	private Double peso;
	private List<ComplementInformaDTO> ComplementInforDTO;
	
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
	public List<ComplementInformaDTO> getComplementInforDTO() {
		return ComplementInforDTO;
	}
	public void setComplementInforDTO(List<ComplementInformaDTO> complementInforDTO) {
		ComplementInforDTO = complementInforDTO;
	}
	
	
	
}
