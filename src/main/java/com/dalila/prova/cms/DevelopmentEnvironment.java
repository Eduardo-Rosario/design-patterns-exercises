package com.dalila.prova.cms;

public class DevelopmentEnvironment extends Environment {

	@Override
	public void execute(int webServiceIndex) {
		System.out.println(
				String.format("Executando %s no ambiente de desenvolvimento", 
						this.webServices.get(webServiceIndex).getDomain()));
	}

}
