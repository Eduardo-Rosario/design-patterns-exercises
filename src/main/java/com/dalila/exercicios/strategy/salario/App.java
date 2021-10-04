package com.dalila.exercicios.strategy.salario;

public class App {
    public static void main(String[] args ){
    	Funcionario gerente = new Funcionario(10000);
    	Funcionario desenvolvedor = new Funcionario(5000);
    	Funcionario AnalistaSuporte = new Funcionario(3000);
    	
    	printSalario(obterSalario(gerente, ListaDepartamentos.GERENCIA));
    	printSalario(obterSalario(desenvolvedor, ListaDepartamentos.DESENVOLVIMENTO));
    	printSalario(obterSalario(AnalistaSuporte, ListaDepartamentos.SUPORTE));
    }

	private static void printSalario(double salario) {
		System.out.println(String.format("R$ %s", salario));
	}

	private static double obterSalario(Funcionario funcionario, 
			Departamento departamento) {
		return CalculadoraPagamento.calcular(funcionario, departamento);
	}
	
}
