package com.dalila.prova.cms;

public class ConcreteCreator {

	public static Environment factoryMethod(TipoEnvironment tipo) {
		Environment ambiente = null;
		if(tipo.equals(TipoEnvironment.DEVELOPMENT)) { 
			ambiente = new DevelopmentEnvironment();
		} else if(tipo.equals(TipoEnvironment.HOMOLOG)){ 
			ambiente = new TestEnvironment();
		} else if (tipo.equals(TipoEnvironment.PRODUCTION)) {
			ambiente = new ProdEnvironment();
		}
		return ambiente;
	}

}
