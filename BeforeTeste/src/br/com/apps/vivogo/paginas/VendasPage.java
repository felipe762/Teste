package br.com.apps.vivogo.paginas;

import br.com.utils.common.Page;
import br.com.utils.common.fields.CheckBox;
import br.com.utils.common.fields.RadioBox;

public class VendasPage extends Page {

    @Override
    public void initializeFields() {

    }

    public void abrirInserirVendas() {
//        getFinder().buscaPeloId(Menu.MENU_VENDA).click();
//        getFinder().buscaPeloId(Menu.SUBMENU_VENDA).click();
        getFinder().buscaPeloId("GrupoMenuModulo20").click();
        sleep(500);
        getFinder().buscaPeloId("inserir-registroMenuModulo20").click();
    }

    public void goToTabProdutoVivo() {
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
    }
}
