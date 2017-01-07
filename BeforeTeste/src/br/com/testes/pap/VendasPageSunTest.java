package br.com.testes.pap;
//Mensagem de campo obrigatório
//Assert.assertTrue(vendas.getVendedor().verificaTextoNosAtributosDoCampo("Informe o Vendedor;"));
//vendas.salvar();
//Mensagem de Erro
//Assert.assertTrue(vendas.verificaBoxErroTemMensagem("É necessário lançar pelo menos um serviço"));

import br.com.apps.sun.pappaginas.LoginSun;
import br.com.apps.sun.pappaginas.VendasPageSun;
import br.com.utils.Alt.GeraCPF;
import org.junit.Before;
import org.junit.Test;
import br.com.utils.common.Page;
public class VendasPageSunTest extends Page {

    @Override
    public void initializeFields() {

    }

    private LoginSun login;
    private VendasPageSun vendas;
//hhudkfdkl
    @Test
    public void vender() {
        for (int i = 0; i < 1; i++) {

            login = new LoginSun();
            login.logar();
            vendas = new VendasPageSun();

            getFinder().buscaPeloId("menu_7").click();
            getFinder().buscaPeloId("submenu_7_6").click();
            getFinder().buscaPeloId("GrupoMenuModulo22").click();
            sleep(500);
            getFinder().buscaPeloId("inserir-registroMenuModulo22").click();

            vendas.getEstado().selecionaPeloTexto("MG");
            vendas.getPdv().buscar("PAP20-00001");
            getFinder().buscaPeloId("ui-id-6").click();

            getFinder().buscaPeloId("ufVenda").click();
            getFinder().buscaPeloId("ufVenda").click();
            /*vendas.salvar();
            Assert.assertTrue(vendas.getVendedor().verificaTextoNosAtributosDoCampo("Informe o Vendedor;"));
            */
            vendas.getVendedor().buscar("    ");
            getFinder().buscaPeloId("ui-id-9").click();
            /*vendas.salvar();
            Assert.assertTrue(vendas.verificaBoxErroTemMensagem("É necessário lançar pelo menos um serviço"));
            */
            vendas.getObservação().digita("-Teste:@#$%&1ª2º3êó;;");
            //vendas.salvar();
            /*Assert.assertTrue(vendas.verificaBoxErroTemMensagem("É necessário lançar pelo menos um serviço"));
            */
            getFinder().buscaPeloId("tipo_plano_clone1").click();
            //vendas.salvar();
            getFinder().buscaPeloNomeDaClasse("botaoInsere").click();
            //vendas.salvar();

            //pl_id1
            vendas.getPlano().selecionaPeloTexto("CONTROLE FATURA 1,5GB - R$49.99");
            vendas.getObservação().digita("-Teste:@#$%&1ª2º3êó;;");
            vendas.salvar();
            // Assert.assertTrue(vendas.getPlano().verificaTextoNosAtributosDoCampo("Campo obrigatório para vendas com serviço de alta;"));
            vendas.getIccid().digita("89558278372873279382");
            //vese_fatura_vencimento1
            getFinder().buscaPeloId("vese_fatura_vencimento11").click();

            //Mudar de aba
            vendas.getObservação().digita("-Teste:@#$%&1ª2º3êó;;");
            vendas.salvar();//não deletar
            getFinder().buscaPeloId("liDadosServico").click();

            //Dados do cliente
            GeraCPF g = new GeraCPF();
            vendas.getCpf().digita(g.geraCPFFinal());

        /*vendas.salvar();
        Assert.assertTrue(vendas.getCpf().verificaTextoNosAtributosDoCampo("Informe o CPF;"));*/
            vendas.getNome().digita("Jose");
       /* vendas.salvar();
        Assert.assertTrue(vendas.getNome().verificaTextoNosAtributosDoCampo("Informe o nome;"));*/
            vendas.getNomeMae().digita("Lia");
        /*vendas.salvar();
        Assert.assertTrue(vendas.getNomeMae().verificaTextoNosAtributosDoCampo("Informe o Nome da Mãe;"));*/
            vendas.getDataNascimento().digita("28091993");
       /* vendas.salvar();
        Assert.assertTrue(vendas.getDataNascimento().verificaTextoNosAtributosDoCampo("Informe a Data de Nascimento;"));*/
            getFinder().buscaPeloId("pess_sexo1").click();
            vendas.getCep().digita("13500313");
            //getFinder().buscaPeloId("pess_rua").click();
            vendas.getNumero().digita("665");
        /*vendas.salvar();
        Assert.assertTrue(vendas.getCep().verificaTextoNosAtributosDoCampo("Informe o CEP;"));*//**//*
        vendas.salvar();*/
        vendas.getUf().digita("MT");
        //vendas.salvar();
        vendas.getCidade().digita("");
        vendas.getEndereco().digita("");

        vendas.getBairro().digita("Aero Rancho");
        vendas.getComplemento().digita("Mercado");
        /*Assert.assertTrue(vendas.getCep().verificaTextoNosAtributosDoCampo("Informe o Telefone;"));
        vendas.salvar();*/
            vendas.getEmail().digita("felipdfe@gmail.com");
            vendas.getTelefone1().digita("67992119043");
            //Assert.assertTrue(vendas.getEmail().verificaTextoNosAtributosDoCampo("Campo obrigatório para vendas com fatura por email;"));
            vendas.getTelefone2().digita("67992140043");
            vendas.salvar();
            getFinder().buscaPeloId("btnSalvar").click();

           // login.fecharNavegador();
        }
    }
}

