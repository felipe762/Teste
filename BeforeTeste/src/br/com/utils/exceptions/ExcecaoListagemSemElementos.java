package br.com.utils.exceptions;

import org.openqa.selenium.TimeoutException;

public class ExcecaoListagemSemElementos extends TimeoutException {

	private static final long serialVersionUID = -7211658223078295197L;

	@Override
	public String getMessage() {
		return "Elementos da lista não apareceram a tempo!";
	}
	
	

}
