package br.com.testes.vivogo;


import br.com.apps.vivogo.login.LoginSyscor;
import br.com.apps.vivogo.paginas.VendasPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendasPageTest {

    private LoginSyscor login;
    private VendasPage vendas;

    @Before
    public void setUp() throws Exception {
        login = new LoginSyscor();
        login.logar();

        vendas = new VendasPage();

    }

    @After
    public void tearDown() throws Exception {
        //login.fecharNavegador();
    }

    @Test
    public void deveVenderUmItem() {
        vendas.abrirInserirVendas();

        vendas.goToTabProdutoVivo();
        vendas.addProdutoVivo();
        vendas.enableVendaSVA();

        String[] itens = {"1008", "1119", "37"};
        vendas.selecionarSvaDescontoAparelho(itens);

    }

}
