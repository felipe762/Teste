package br.com.testes.pap;
//Mensagem de campo obrigatório
//Assert.assertTrue(vendasPap.getVendedor().verificaTextoNosAtributosDoCampo("Informe o Vendedor;"));
//vendasPap.salvar();
//Mensagem de Erro
//Assert.assertTrue(vendasPap.verificaBoxErroTemMensagem("É necessário lançar pelo menos um serviço"));

import br.com.apps.sun.pap.CadastroUsuario;
import br.com.apps.sun.pap.LoginPap;
import br.com.utils.common.Page;
import org.junit.Assert;
import org.junit.Test;

public class CadastroUsuarioPapTest extends Page {

    @Override
    public void initializeFields() {

    }

    private LoginPap login;
    private CadastroUsuario CadastroUsuario;

    @Test
    public void cadastro() {
       // for (int i = 0; i < 5; i++) {

            login = new LoginPap();
            login.logar();
            CadastroUsuario = new CadastroUsuario();

            getFinder().buscaPeloId("menu_6").click();
            getFinder().buscaPeloId("submenu_6_3").click();
            getFinder().buscaPeloId("GrupoMenuModulo8").click();
            sleep(500);
            getFinder().buscaPeloId("inserir-registroMenuModulo8").click();


            /*getFinder().buscaPeloId("btnSalvar").click();
            login.fecharNavegador();*/
        }
    }


