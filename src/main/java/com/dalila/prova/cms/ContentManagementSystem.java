package com.dalila.prova.cms;

public class ContentManagementSystem {

	public static void main(String[] args) {
        Environment AmbienteTeste = ConcreteCreator.factoryMethod(TipoEnvironment.HOMOLOG);
        
        WebService wb1 = new WebService("www.g1.com");
        WebService wb2 = new WebService("www.mercadolivre.com");
        WebService wb3 = new WebService("www.ntflix.com");
        
        AmbienteTeste.adicionar(wb1);
        AmbienteTeste.adicionar(wb2);
        AmbienteTeste.adicionar(wb3);
        
        AmbienteTeste.execute(0);
        AmbienteTeste.execute(1);
        AmbienteTeste.execute(2);
	}

}
