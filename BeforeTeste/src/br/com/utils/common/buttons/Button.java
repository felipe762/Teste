package br.com.utils.common.buttons;


import br.com.utils.common.Finder;

public class Button {
	
	private Finder finder;
	public String id;
	public String className;

	public Button() {
		id = className = null;
		finder = new Finder();
	}
	
	public void comClasse(String nomeDaClasse) {
		className = nomeDaClasse;
	}
	
	public void comId(String id) {
		this.id = id;
		
	}
	
	public void clicar() {
		if (id != null) {
			finder.buscaPeloId(id).click();
		} else if (className != null) {
			finder.buscaPeloNomeDaClasse(className).click();
		}
	}

}
