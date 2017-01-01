package br.com.testes.sun;


import br.com.apps.sun.paginas.LoginSun;
import br.com.apps.sun.paginas.VendasPageSun;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendasPageSunTest {

    private LoginSun login;
    private VendasPageSun vendas;

    @Before
    public void setUp() throws Exception {
        login = new LoginSun();
        login.logar();
        vendas = new VendasPageSun();
    }

    @After
    public void tearDown() throws Exception {
        //login.fecharNavegador();
    }

    @Test
    public void deveVenderUmItem() {
        vendas.abrirInserirVendas();
        /*vendas.goToTabProdutoVivoSun();
        vendas.addProdutoVivo();
        vendas.enableVendaSVA();
        String[] itens = {"1008", "1119", "37"};
        vendas.selecionarSvaDescontoAparelho(itens);*/
    }
}

