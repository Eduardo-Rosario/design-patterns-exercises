package com.dalila.exercicios.factory.figura;

public class FiguraFabrica extends Fabrica {

	@Override
	public Figura factoryMethod(Lista tipo) {
		Figura figura = null;
		if(tipo.equals(Lista.QUADRADO)){
			figura = new Quadrado();
		}
		else if(tipo.equals(Lista.TRAPEZIO)){
			figura = new Trapezio();
		}
		else if(tipo.equals(Lista.TRIANGULO)){
			figura = new Triangulo();
		}
		else if(tipo.equals(Lista.HEXAGONO)){
			figura = new Hexagono();
		}
		else if(tipo.equals(Lista.PENTAGONO)){
			figura = new Pentagono();
		}
		else{
			throw new IllegalArgumentException("Carro inválido!");
		}
		return figura;
	}

}
