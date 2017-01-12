package br.com.testes.pap;
//Mensagem de campo obrigatório
//Assert.assertTrue(vendasPap.getVendedor().verificaTextoNosAtributosDoCampo("Informe o Vendedor;"));
//vendasPap.salvar();
//Mensagem de Erro
//Assert.assertTrue(vendasPap.verificaBoxErroTemMensagem("É necessário lançar pelo menos um serviço"));

import br.com.apps.sun.pap.LoginPap;
import br.com.apps.sun.pap.VendasPap;
import br.com.utils.Alt.GeraCPF;
import org.junit.Assert;
import org.junit.Test;
import br.com.utils.common.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VendasPapTest extends Page {

    @Override
    public void initializeFields() {

    }

    private LoginPap login;
    private VendasPap vendasPap;
//ok
    @Test
    public void vender() {
        for (int i = 0; i < 5; i++) {

            login = new LoginPap();
            login.logar();
            vendasPap = new VendasPap();

            getFinder().buscaPeloId("menu_7").click();
            getFinder().buscaPeloId("submenu_7_6").click();
            getFinder().buscaPeloId("GrupoMenuModulo22").click();
            sleep(500);
            getFinder().buscaPeloId("inserir-registroMenuModulo22").click();

            vendasPap.getEstado().selecionaPeloTexto("MG");
            vendasPap.getPdv().buscar("PAP20-00001");
            getFinder().buscaPeloId("ui-id-6").click();

            getFinder().buscaPeloId("ufVenda").click();
            getFinder().buscaPeloId("ufVenda").click();
            /*vendasPap.salvar();
            Assert.assertTrue(vendasPap.getVendedor().verificaTextoNosAtributosDoCampo("Informe o Vendedor;"));
            */
            vendasPap.getVendedor().buscar("    ");
            //dropdown pdv
            getFinder().buscaPeloId("ui-id-9").click();
            //vendasPap.salvar();
            //Assert.assertTrue(vendasPap.verificaBoxErroTemMensagem("É necessário lançar pelo menos um serviço"));
            vendasPap.getObservação().digita("-Teste:@#$%&1ª2º3êó;;");
            vendasPap.salvar();
            Assert.assertTrue(vendasPap.verificaBoxErroTemMensagem("É necessário lançar pelo menos um serviço"));

            getFinder().buscaPeloId("tipo_plano_clone1").click();
            vendasPap.salvar();
            getFinder().buscaPeloNomeDaClasse("botaoInsere").click();
            vendasPap.salvar();

            //pl_id1
            vendasPap.getPlano().selecionaPeloTexto("CONTROLE FATURA 1,5GB - R$49.99");
            vendasPap.getObservação().digita("-Teste:@#$%&1ª2º3êó;;");
            //vendasPap.salvar();
            //Assert.assertTrue(vendasPap.getPlano().verificaTextoNosAtributosDoCampo("Campo obrigatório para vendasPap com serviço de alta;"));
            vendasPap.getIccid().digita("89558278372873279382");
            //vese_fatura_vencimento1
            getFinder().buscaPeloId("vese_fatura_vencimento11").click();

            //Mudar de aba
            vendasPap.getObservação().digita("-Teste:@#$%&1ª2º3êó;;");
            vendasPap.salvar();//não deletar
            getFinder().buscaPeloId("liDadosServico").click();

            //Dados do cliente
            GeraCPF g = new GeraCPF();
            vendasPap.getCpf().digita(g.geraCPFFinal());
            /*WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("botaoOk")));
            vendasPap.salvar();*/
            //Assert.assertTrue(vendasPap.getCpf().verificaTextoNosAtributosDoCampo("Informe o CPF;"));
            vendasPap.getNome().digita("Jose");
           /* vendasPap.salvar();
            Assert.assertTrue(vendasPap.getNome().verificaTextoNosAtributosDoCampo("Informe o nome;"));*/
            vendasPap.getNomeMae().digita("Lia");
            vendasPap.salvar();
            Assert.assertTrue(vendasPap.getNomeMae().verificaTextoNosAtributosDoCampo("Informe o Nome da Mãe;"));
            vendasPap.getDataNascimento().digita("28091993");
            vendasPap.salvar();
            Assert.assertTrue(vendasPap.getDataNascimento().verificaTextoNosAtributosDoCampo("Informe a Data de Nascimento;"));
            getFinder().buscaPeloId("pess_sexo1").click();
            vendasPap.getCep().digita("13500313");
            vendasPap.getNumero().digita("665");
            vendasPap.salvar();
            Assert.assertTrue(vendasPap.getCep().verificaTextoNosAtributosDoCampo("Informe o CEP;"));
            vendasPap.salvar();
            vendasPap.getUf().digita("MT");
            vendasPap.salvar();
            vendasPap.getCidade().digita("");
            vendasPap.getEndereco().digita("");
            vendasPap.getBairro().digita("Aero Rancho");
            vendasPap.getComplemento().digita("Mercado");
            /*Assert.assertTrue(vendasPap.getCep().verificaTextoNosAtributosDoCampo("Informe o Telefone;"));
            vendasPap.salvar();*/
            vendasPap.getEmail().digita("felipdfe@gmail.com");
            vendasPap.getTelefone1().digita("67992119043");
            //Assert.assertTrue(vendasPap.getEmail().verificaTextoNosAtributosDoCampo("Campo obrigatório para vendasPap com fatura por email;"));
            vendasPap.getTelefone2().digita("67992140043");
            vendasPap.salvar();
            getFinder().buscaPeloId("btnSalvar").click();
            login.fecharNavegador();
        }
    }
}

