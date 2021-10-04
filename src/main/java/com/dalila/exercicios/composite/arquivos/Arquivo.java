package com.dalila.exercicios.composite.arquivos;

public class Arquivo implements ArquivoComponent {

	private String nomeArquivo;
	private float tamanho;
	
	
	public Arquivo(String nomeArquivo,
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
		return tamanho;
	}
	
	public void seTamanho(float tamanho){
		this.tamanho = tamanho;
	}

}
