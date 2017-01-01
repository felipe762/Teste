package br.com.apps.sun.paginas;

import br.com.utils.common.Page;

public class VendasPageSun extends Page {

	@Override
	public void initializeFields() {

	}

	public void abrirInserirVendas() {
		getFinder().buscaPeloId("menu_7").click();
		getFinder().buscaPeloId("submenu_7_6").click();
		getFinder().buscaPeloNomeDaClasse("box-header fechado").click();
		sleep(500);
		getFinder().buscaPeloNomeDaClasse("botoesListaItem  corBotaoInsere botoesListaItem_fix").click();
	}}

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

