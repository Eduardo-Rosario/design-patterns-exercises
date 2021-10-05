package com.dalila.exercicios.factory.graduacao;

public class Candidato {

	private Requisito grauEscolaridade;
	private String nome;
	
	public Candidato(String nome, Requisito grauEscolaridade) {
		this.grauEscolaridade = grauEscolaridade;
		this.nome = nome;
	}

	public Requisito getGrauEscolaridade() {
		return grauEscolaridade;
	}

	public void setGrauEscolaridade(Requisito grauEscolaridade) {
		this.grauEscolaridade = grauEscolaridade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
