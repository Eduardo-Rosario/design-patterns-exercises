package com.dalila.exercicios.strategy.imposto;

public class CalculadoraImposto {
	
	public static double calcular(Tributavel tributavel, Imposto imposto) {
		return imposto.getValor(tributavel.valor);
	}

}
