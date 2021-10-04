package com.dalila.exercicios.composite.departamento;

import java.util.ArrayList;
import java.util.List;

public class Diretoria implements DepartamentoComponent {

	private List<DepartamentoComponent> departamentos = new ArrayList<DepartamentoComponent>();
	
	@Override
	public double getCusto() {
		double custoTotal = 0;
		for(DepartamentoComponent dep : departamentos)
			custoTotal += dep.getCusto();
		return custoTotal;
	}

	@Override
	public double getFuncionario() {
		double funcionariosTotal = 0;
		for(DepartamentoComponent dep: departamentos)
			funcionariosTotal += dep.getFuncionario();
		return funcionariosTotal;
	}
	
	public void adicionar(DepartamentoComponent departamento) {
		departamentos.add(departamento);
	}
	
	public void remover(DepartamentoComponent departamento) {
		departamentos.remove(departamento);
	}

}
