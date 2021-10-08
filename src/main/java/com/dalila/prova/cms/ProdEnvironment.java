package com.dalila.prova.cms;

public class ProdEnvironment extends Environment {

	@Override
	public void execute(int webServiceIndex) {
		System.out.println(
				String.format("Executando %s no ambiente de produção", 
						this.webServices.get(webServiceIndex).getDomain()));
	}

}
