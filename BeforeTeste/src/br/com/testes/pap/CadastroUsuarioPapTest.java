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
import org.openqa.selenium.By;

public class CadastroUsuarioPapTest extends Page {

    @Override
    public void initializeFields() {

    }

    private LoginPap login;
    private CadastroUsuario cadastroUsuario;

    @Test
    public void cadastro() {
       // for (int i = 0; i < 5; i++) {

            login = new LoginPap();
            login.logar();
            cadastroUsuario = new CadastroUsuario();

            getFinder().buscaPeloId("menu_6").click();
            getFinder().buscaPeloId("submenu_6_3").click();
            getFinder().buscaPeloId("GrupoMenuModulo8").click();
            sleep(500);
            getFinder().buscaPeloId("inserir-registroMenuModulo8").click();

            cadastroUsuario.getFuncao().selecionaPeloTexto("Vendedor");
            cadastroUsuario.getNome().digita("Teste 1");
            cadastroUsuario.getRe().digita("741963");
            cadastroUsuario.getCpf().digita("52455488608");
            cadastroUsuario.getCelular().digita("67992149090");
            cadastroUsuario.getEmail().digita("ujhjfhdfd@gmail.com");
            cadastroUsuario.getDatanascimento().digita("28091993");
            getFinder().buscaPeloName("us_data_nasc");
            //liAbaInfoUsuarioInformacoesAcesso
            driver.findElement(By.id("div_item_data"));
            cadastroUsuario.salvar();

            /*getFinder().buscaPeloId("btnSalvar").click();
            login.fecharNavegador();*/
        }
    }


