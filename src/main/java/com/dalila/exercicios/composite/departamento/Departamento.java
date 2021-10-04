package com.dalila.exercicios.composite.departamento;

import java.util.List;

import com.dalila.exercicios.strategy.salario.Funcionario;

public class Departamento implements DepartamentoComponent {

	private List<Funcionario> funcionarios;
	
	public Departamento(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	@Override
	public double getCusto() {
		double custoDepartamento = 0;
		for(Funcionario fun : funcionarios) 
			custoDepartamento += fun.getSalario();
		return custoDepartamento;
	}

	@Override
	public double getFuncionario() {return funcionarios.size();}

}
