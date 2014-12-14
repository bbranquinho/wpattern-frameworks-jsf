package br.com.wpattern.frameworks.jsf;

import javax.inject.Named;


@Named
public class Data implements IData {

	@Override
	public String projectName() {
		return "WPattern using JSF 2.0, Primefaces and Spring";
	}

}
