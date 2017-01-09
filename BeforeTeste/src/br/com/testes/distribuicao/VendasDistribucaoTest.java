package br.com.testes.distribuicao;
//Mensagem de campo obrigatório
//Assert.assertTrue(vendasPap.getVendedor().verificaTextoNosAtributosDoCampo("Informe o Vendedor;"));
//vendasPap.salvar();
//Mensagem de Erro
//Assert.assertTrue(vendasPap.verificaBoxErroTemMensagem("É necessário lançar pelo menos um serviço"));

import br.com.apps.sun.distribuicao.LoginDistribuicao;
import br.com.apps.sun.distribuicao.VendasDistribuicao;
import br.com.apps.sun.revenda.LoginRevenda;
import br.com.utils.Alt.GeraCPF;
import br.com.utils.common.Page;
import org.junit.Test;

public class VendasDistribucaoTest extends Page {

    @Override
    public void initializeFields() {

    }

    private LoginDistribuicao login;
    private VendasDistribuicao vendas;
//ok
    @Test
    public void vender() {
        for (int i = 0; i < 5; i++) {

            login = new LoginDistribuicao();
            login.logar();
            vendas = new VendasDistribuicao();

            getFinder().buscaPeloId("menu_7").click();
            getFinder().buscaPeloId("submenu_7_6").click();
            getFinder().buscaPeloId("GrupoMenuModulo22").click();
            sleep(500);
            getFinder().buscaPeloId("inserir-registroMenuModulo22").click();

            vendas.getEstado().selecionaPeloTexto("MG");
            vendas.getPdv().buscar("MERCEARIA MARGARIDA");
            getFinder().buscaPeloId("ui-id-6").click();
            getFinder().buscaPeloId("ufVenda").click();
            getFinder().buscaPeloId("ufVenda").click();
            /*vendasPap.salvar();
            Assert.assertTrue(vendasPap.getVendedor().verificaTextoNosAtributosDoCampo("Informe o Vendedor;"));
            */
            vendas.getVendedor().buscar("    ");
            getFinder().buscaPeloId("ui-id-9").click();
            vendas.salvar();//não apagar
            getFinder().buscaPeloNomeDaClasse("botaoPadrao").click();
            //vendasPap.salvar();
            vendas.getPlano().selecionaPeloTexto("CONTROLE FATURA 1,5GB - R$49.99");
            vendas.getObservação().digita("-Teste:@#$%&1ª2º3êó;;");
            vendas.salvar();
            // Assert.assertTrue(vendasPap.getPlano().verificaTextoNosAtributosDoCampo("Campo obrigatório para vendasPap com serviço de alta;"));
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

        /*vendasPap.salvar();
        Assert.assertTrue(vendasPap.getCpf().verificaTextoNosAtributosDoCampo("Informe o CPF;"));*/
            vendas.getNome().digita("Jose");
       /* vendasPap.salvar();
        Assert.assertTrue(vendasPap.getNome().verificaTextoNosAtributosDoCampo("Informe o nome;"));*/
            vendas.getNomeMae().digita("Lia");
        /*vendasPap.salvar();
        Assert.assertTrue(vendasPap.getNomeMae().verificaTextoNosAtributosDoCampo("Informe o Nome da Mãe;"));*/
            vendas.getDataNascimento().digita("28091993");
       /* vendasPap.salvar();
        Assert.assertTrue(vendasPap.getDataNascimento().verificaTextoNosAtributosDoCampo("Informe a Data de Nascimento;"));*/
            getFinder().buscaPeloId("pess_sexo1").click();
            vendas.getCep().digita("13500313");
            //getFinder().buscaPeloId("pess_rua").click();
            vendas.getNumero().digita("665");
        /*vendasPap.salvar();
        Assert.assertTrue(vendasPap.getCep().verificaTextoNosAtributosDoCampo("Informe o CEP;"));*//**//*
        vendasPap.salvar();*/
        vendas.getUf().digita("MT");
        //vendasPap.salvar();
        vendas.getCidade().digita("");
        vendas.getEndereco().digita("");

        vendas.getBairro().digita("Aero Rancho");
        vendas.getComplemento().digita("Mercado");
        /*Assert.assertTrue(vendasPap.getCep().verificaTextoNosAtributosDoCampo("Informe o Telefone;"));
        vendasPap.salvar();*/
            vendas.getEmail().digita("felipdfe@gmail.com");
            vendas.getTelefone1().digita("67992119043");
            //Assert.assertTrue(vendasPap.getEmail().verificaTextoNosAtributosDoCampo("Campo obrigatório para vendasPap com fatura por email;"));
            vendas.getTelefone2().digita("67992140043");
            vendas.salvar();
            getFinder().buscaPeloId("btnSalvar").click();

            login.fecharNavegador();
        }
    }
}

