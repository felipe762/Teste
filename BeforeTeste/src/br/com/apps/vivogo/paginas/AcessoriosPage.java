package br.com.apps.vivogo.paginas;

import br.com.utils.common.Page;
import br.com.utils.common.buttons.Button;
import br.com.utils.common.fields.Text;
import br.com.utils.common.fields.SelectBox;

public class AcessoriosPage extends Page {

	/* CAMPOS */
	private Text ncm;
	private Text nome;
	private SelectBox grupoAcessorios;
	private Button importar;

	/* METODOS INICIADOS COM navegar INDICAM A NAVEGABILIDADE DA PÁGINA */

	public void navegarDoInicioParaListagemDeAcessorios() {
		//Menu.navegar().listarAcessorio();
	}
	
	public void listarAcessorios() {
		//Menu.navegar().clicarListagemAcessorios();
	}

	/* input methods */
	public AcessoriosPage digitaNome(String valor) {
		nome.digita(valor);
		return this;
	}

	public AcessoriosPage digitaNCM(String valor) {
		ncm.digita(valor);
		return this;
	}
	
	public AcessoriosPage selecionaGrupoAcessorios(String texto) {
		grupoAcessorios.selecionaPeloTexto(texto);
		return this;
	}
	
	@Override
	public void initializeFields() {
		
		ncm = new Text();
		ncm.set("ac_ncm");
		
		nome = new Text();
		nome.set("ac_nome");
		
		grupoAcessorios = new SelectBox();
		grupoAcessorios.set("ag_id");
		
		importar = new Button();
		importar.comClasse("corBotaoUpload");
		
	}

	public Text getNcm() {
		return ncm;
	}

	public Text getNome() {
		return nome;
	}

	public SelectBox getGrupoAcessorios() {
		return grupoAcessorios;
	}
}
