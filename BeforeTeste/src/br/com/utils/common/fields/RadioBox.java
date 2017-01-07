package br.com.utils.common.fields;

import java.util.List;

import br.com.utils.common.Finder;
import org.openqa.selenium.WebElement;


public class RadioBox extends Field {

	private Finder finder = new Finder();

	public void	escolhe(String valor) {
		
		 List<WebElement> radios = finder.buscaTodosPeloName(getName());

	     if (radios.size() > 0) {
	    	 for (WebElement option : radios) {
	    		 if (option.getAttribute("value").equals(valor)) {
	    			option.click();
	    		 }
	    	 }
	     }	
	}
	
	public boolean verificaSelecionado(String valor) {
		List<WebElement> radios = finder.buscaTodosPeloName(getName());
		 
	     if (radios.size() > 0) {
	    	 for (WebElement option : radios) {
	    		 if (option.isSelected()) {
	    			 return option.getAttribute("value").equals(valor);
	    		 }
	    	 }
	     }	
	     return false;
	}

}
