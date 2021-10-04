package com.dalila.exercicios.strategy.imposto;

public abstract class Tributavel {
	protected double valor;
	
	public void setValor(double valor) {this.valor = valor;};
	
	public double getValor() {return this.valor;}
}
