package com.dalila.exercicios.strategy.imposto;

public enum ListaImpostos implements Imposto{

	IP1{
		@Override
		public double getValor(double valor) {
			return valor * 0.1;
		}
	},
	IP2{
		@Override
		public double getValor(double valor) {
			return valor * 0.15;
		}
	},
	IP3{
		@Override
		public double getValor(double valor) {
			return valor * 0.25;
		}
	};
}
