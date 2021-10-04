package com.dalila.exercicios.composite.arquivos;

import java.util.ArrayList;
import java.util.List;

public class Diretorio implements ArquivoComponent {

	private String nomeArquivo;
	private float tamanho;
	private List<ArquivoComponent> arquivos = new ArrayList<ArquivoComponent>();
	
	public Diretorio(String nomeArquivo,
			float tamanho) {
		this.nomeArquivo = nomeArquivo;
		this.tamanho = tamanho;
	}
	
	@Override
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	
	public void setNomeArquivo(String nomeArquivo){
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	public float getTamanho() {
		float tamanhoTotalDiretorio = tamanho;
		for(ArquivoComponent arq : arquivos) {
			tamanhoTotalDiretorio += arq.getTamanho();
		}
		return tamanhoTotalDiretorio;
	}
	
	public void seTamanho(float tamanho){
		this.tamanho = tamanho;
	}
	
	public void adicionar(ArquivoComponent arquivo) {
		arquivos.add(arquivo);
	}
	
	public void remover(ArquivoComponent arquivo) {
		arquivos.remove(arquivo);
	}

}
