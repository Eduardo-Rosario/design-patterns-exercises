package com.dalila.exercicios.composite.arquivos;

public class App {

	public static void main(String[] args) {
		Diretorio raiz = new Diretorio("c://", 1.0f);
		Diretorio users = new Diretorio("Users", 1.0f);
		
		Diretorio musicas = new Diretorio("Músicas", 1.0f);
		musicas.adicionar(new Arquivo("musica1.mp3", 3.5f));
		musicas.adicionar(new Arquivo("musica2.mp3", 4.5f));
		musicas.adicionar(new Arquivo("musica3.mp3", 5.5f));
		
		Diretorio imagens = new Diretorio("Imagens", 1.0f);
		imagens.adicionar(new Arquivo("imagem1.jpg", 1.5f));
		imagens.adicionar(new Arquivo("imagem2.jpg", 1.6f));
		imagens.adicionar(new Arquivo("imagem3.jpg", 1.7f));
		
		Diretorio documentos = new Diretorio("Documentos", 1.0f);
		imagens.adicionar(new Arquivo("documento1.doc", 5.5f));
		imagens.adicionar(new Arquivo("documento2.xls", 6.0f));
		imagens.adicionar(new Arquivo("documento3.ppt", 6.5f));
		
		users.adicionar(musicas);
		users.adicionar(imagens);
		users.adicionar(documentos);
		raiz.adicionar(users);
		
		System.out.println(raiz.getTamanho());
	}

}
