package br.com.testes.utilitários;
//Mensagem de campo obrigatório
//Assert.assertTrue(vendasPap.getVendedor().verificaTextoNosAtributosDoCampo("Informe o Vendedor;"));
//vendasPap.salvar();
//Mensagem de Erro
//Assert.assertTrue(vendasPap.verificaBoxErroTemMensagem("É necessário lançar pelo menos um serviço"));

import br.com.apps.sun.pap.LoginPap;
import br.com.apps.sun.pap.VendasPap;
import br.com.utils.Alt.GeraCPF;
import br.com.utils.common.Page;
import org.junit.Test;

public class Vendas extends Page {

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
            vendasPap.getVendedor().buscar("    ");
            getFinder().buscaPeloId("ui-id-9").click();
            vendasPap.getObservação().digita("-Teste:@#$%&1ª2º3êó;;");
            getFinder().buscaPeloId("tipo_plano_clone1").click();
            getFinder().buscaPeloNomeDaClasse("botaoInsere").click();
            vendasPap.getPlano().selecionaPeloTexto("CONTROLE FATURA 1,5GB - R$49.99");
            vendasPap.getObservação().digita("-Teste:@#$%&1ª2º3êó;;");
            vendasPap.salvar();
            vendasPap.getIccid().digita("89558278372873279382");
            getFinder().buscaPeloId("vese_fatura_vencimento11").click();

            //Mudar de aba
            vendasPap.getObservação().digita("-Teste:@#$%&1ª2º3êó;;");
            vendasPap.salvar();//não deletar
            getFinder().buscaPeloId("liDadosServico").click();

            //Dados do cliente
            GeraCPF g = new GeraCPF();
            vendasPap.getCpf().digita(g.geraCPFFinal());
            vendasPap.getNome().digita("Jose");
            vendasPap.getNomeMae().digita("Lia");
            vendasPap.getDataNascimento().digita("28091993");
            getFinder().buscaPeloId("pess_sexo1").click();
            //UF, cidade, endereço e bairro , gerado pelo CEP manter comentado
            vendasPap.getCep().digita("13500313");
            vendasPap.getNumero().digita("665");
            //vendasPap.getUf().digita("MT");
            //vendasPap.getCidade().digita("");
            //vendasPap.getEndereco().digita("");
            //vendasPap.getBairro().digita("Aero Rancho");
            vendasPap.getComplemento().digita("Mercado");
            vendasPap.getEmail().digita("felipdfe@gmail.com");
            vendasPap.getTelefone1().digita("67992119043");
            vendasPap.getTelefone2().digita("67992140043");
            vendasPap.salvar();
            getFinder().buscaPeloId("btnSalvar").click();
            login.fecharNavegador();
        }
    }
}

