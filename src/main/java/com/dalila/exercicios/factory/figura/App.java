package com.dalila.exercicios.factory.figura;

public class App {

	public static void main(String[] args) {
		Fabrica fabrica = new FiguraFabrica();
		
		Figura triangulo = fabrica.factoryMethod(Lista.TRIANGULO);
		Figura pentagono = fabrica.factoryMethod(Lista.PENTAGONO);
		Figura quadrado = fabrica.factoryMethod(Lista.QUADRADO);
		Figura trapezio = fabrica.factoryMethod(Lista.TRAPEZIO);
		Figura hexagono = fabrica.factoryMethod(Lista.HEXAGONO);
		
		System.out.println(triangulo.getQuantidadeArestas());
		System.out.println(pentagono.getQuantidadeArestas());
		System.out.println(quadrado.getQuantidadeArestas());
		System.out.println(trapezio.getQuantidadeArestas());
		System.out.println(hexagono.getQuantidadeArestas());
	}

}
