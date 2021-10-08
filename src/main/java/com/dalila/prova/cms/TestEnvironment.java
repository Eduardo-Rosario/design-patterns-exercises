package com.dalila.prova.cms;

public class TestEnvironment extends Environment {

	@Override
	public void execute(int webServiceIndex) {
		System.out.println(
				String.format("Executando %s no ambiente de testes", 
						this.webServices.get(webServiceIndex).getDomain()));
	}
}
