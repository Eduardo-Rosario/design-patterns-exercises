package com.dalila.exercicios.strategy.salario;

public enum ListaDepartamentos implements Departamento {

	GERENCIA {
		@Override
		public double calcularSalario(Funcionario funcionario) {
			return funcionario.getSalario() + (funcionario.getSalario() * 0.06); 
		}
	},
	
	DESENVOLVIMENTO {
		@Override
		public double calcularSalario(Funcionario funcionario) {
			return funcionario.getSalario() + (funcionario.getSalario() * 0.05); 
		}
	},
	
	SUPORTE {
		@Override
		public double calcularSalario(Funcionario funcionario) {
			return funcionario.getSalario() + (funcionario.getSalario() * 0.04); 
		}
	};
}
