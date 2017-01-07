package br.com.utils.common.fields;

import br.com.utils.common.Finder;
import org.openqa.selenium.support.ui.Select;



public class SelectBox extends Field {

	private Select select;
	private Finder finder;
	
	public SelectBox() {
		finder = new Finder();
	}
	
	public void selecionaPeloTexto(String texto) {
		comValor(texto);
		novoSelect().selectByVisibleText(getValor());
	}

	//Criei talvez terei que excluir
	public void escolhe(String texto) {
		comValor(texto);
		novoSelect().selectByVisibleText(getValor());}

	public void selecionaPeloValor(String valor) {
		comValor(valor);
		novoSelect().selectByValue(getValor());
	}
	
	private Select novoSelect() {
		select = new Select(finder.buscaPeloName(getName()));
		return select;
	}

	//Criei talvez terei que excluir
	public void digita(String s) {
	}
}

