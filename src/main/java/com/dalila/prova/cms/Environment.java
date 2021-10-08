package com.dalila.prova.cms;

import java.util.ArrayList;
import java.util.List;

public abstract class Environment {

	protected List<WebService> webServices= new ArrayList<>();
	
	public abstract void execute(int webServiceIndex);
	
	public void adicionar(WebService webService) {
		webServices.add(webService);
	}
}
