package br.com.apps.sun.paginas;

import br.com.utils.common.Page;
import br.com.utils.common.fields.Dropdown;
import br.com.utils.common.fields.SelectBox;

public class VendasPageSun extends Page {

	private SelectBox estado;
	private Dropdown pdv;
	private Dropdown vendedor;

	@Override
	public void initializeFields() {
		estado = new SelectBox();
		estado.set("ufVenda");

		pdv = new Dropdown();
		pdv.set("fiag_id_aux");

		vendedor = new Dropdown();
		vendedor.set("us_id_aux");
	}

	public void abrirInserirVendas() {
		getFinder().buscaPeloId("menu_7").click();
		getFinder().buscaPeloId("submenu_7_6").click();
		getFinder().buscaPeloNomeDaClasse("GrupoMenuModulo22").click();
		sleep(500);
		getFinder().buscaPeloNomeDaClasse("inserir-registroMenuModulo22").click();
	}

	public SelectBox getEstado() {
		return estado;
	}

	public Dropdown getPdv() {
		return pdv;
	}

	public Dropdown getVendedor() {
		return vendedor;
	}
}


   /* public void goToTabProdutoVivoSun() {
        getFinder().buscaPeloId("vendaCelularTab").click();
    }

    public void addProdutoVivo() {
        getFinder().buscaPeloId("addCelularVendaButton").click();
    }

    public void enableVendaSVA() {
        RadioBox radio = new RadioBox();
        radio.comName("vc_sva1");
        radio.escolhe("Sim");
    }

    public void selecionarSvaDescontoAparelho(String[] itens) {
        CheckBox checkbox = new CheckBox("sva_pl_id1[]");
        checkbox.selecionar(itens);
    }*/

