package com.project.AnimalKingdom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ComplementInforma {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeCientifico;
	private Double altura;
	private Double comprimento;
	private Integer expectativaDeVida;
	private Integer periodoDeGestacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeCientifico() {
		return nomeCientifico;
	}
	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getComprimento() {
		return comprimento;
	}
	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}
	public Integer getExpectativaDeVida() {
		return expectativaDeVida;
	}
	public void setExpectativaDeVida(Integer expectativaDeVida) {
		this.expectativaDeVida = expectativaDeVida;
	}
	public Integer getPeriodoDeGestacao() {
		return periodoDeGestacao;
	}
	public void setPeriodoDeGestacao(Integer periodoDeGestacao) {
		this.periodoDeGestacao = periodoDeGestacao;
	}
	
	
}
