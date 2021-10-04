package com.dalila.exercicios.composite.departamento;

import java.util.ArrayList;
import java.util.List;

import com.dalila.exercicios.strategy.salario.Funcionario;

public class App {

	public static void main(String[] args) {
		Diretoria administrativa = new Diretoria();
		Diretoria marketing = new Diretoria();
		
		List<Funcionario> funcionariosRH = new ArrayList<Funcionario>();
		funcionariosRH.add(new Funcionario(1000));
		funcionariosRH.add(new Funcionario(1100));
		funcionariosRH.add(new Funcionario(1200));
		Departamento recursosHumanos = new Departamento(funcionariosRH);
		
		List<Funcionario> funcionariosFinanceiro = new ArrayList<Funcionario>();
		funcionariosFinanceiro.add(new Funcionario(2000));
		funcionariosFinanceiro.add(new Funcionario(2100));
		funcionariosFinanceiro.add(new Funcionario(2200));
		Departamento financeiro = new Departamento(funcionariosFinanceiro);
				
		List<Funcionario> funcionariosComercial = new ArrayList<Funcionario>();
		funcionariosComercial.add(new Funcionario(3000));
		funcionariosComercial.add(new Funcionario(3100));
		funcionariosComercial.add(new Funcionario(3200));
		Departamento comercial = new Departamento(funcionariosComercial);
		
		administrativa.adicionar(recursosHumanos);
		administrativa.adicionar(financeiro);
		marketing.adicionar(comercial);
		
		System.out.println(recursosHumanos.getCusto());
		System.out.println(recursosHumanos.getFuncionario());
		
		System.out.println(financeiro.getCusto());
		System.out.println(financeiro.getFuncionario());
		
		System.out.println(comercial.getCusto());
		System.out.println(comercial.getFuncionario());
		
		System.out.println(administrativa.getCusto());
		System.out.println(administrativa.getFuncionario());
		
		System.out.println(marketing.getCusto());
		System.out.println(marketing.getFuncionario());
	}

}
