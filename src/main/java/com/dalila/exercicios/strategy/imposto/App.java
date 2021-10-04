package com.dalila.exercicios.strategy.imposto;

public class App {

	public static void main(String[] args) {

		Produto produto = new Produto(100);
		Servico servico = new Servico(900);
		
		Orcamento orcamento = new Orcamento();
		orcamento.setTotal(
			(produto.getValor() + CalculadoraImposto.calcular(produto, ListaImpostos.IP1)) +
			(servico.getValor() + CalculadoraImposto.calcular(servico, ListaImpostos.IP2))
		);
		
		System.out.println(String.format("R$ %s", orcamento.getTotal()));
	}
}
