package com.project.AnimalKingdom.ModelDTO;

public class AnimalDTO {
    
	private Long id;
	private String nome;
 	private Integer velocidade;
	private Double peso;
	
	private String nomeCientifico;
	private Double altura;
	private Double comprimento;
	private Integer expectativaDeVida;	
	private Integer periodoDeGestacao;
	
	
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
