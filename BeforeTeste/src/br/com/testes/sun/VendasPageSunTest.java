package br.com.testes.sun;
import br.com.apps.sun.paginas.LoginSun;
import br.com.apps.sun.paginas.VendasPageSun;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import br.com.utils.common.Page;
import java.awt.*;
import static java.lang.Thread.sleep;
public class VendasPageSunTest extends Page {
    @Override
    public void initializeFields() {
    }
    private LoginSun login;
    private VendasPageSun vendas;
    @Before
    public void setUp() throws Exception {
        login = new LoginSun();
        login.logar();
        vendas = new VendasPageSun();
        getFinder().buscaPeloId("menu_7").click();
        getFinder().buscaPeloId("submenu_7_6").click();
        getFinder().buscaPeloId("GrupoMenuModulo22").click();
        sleep(500);
        getFinder().buscaPeloId("inserir-registroMenuModulo22").click();
    }
    /* @After
     public void tearDown() throws Exception {
         login.fecharNavegador();
     }*/
    @Test
    public void vender() {
        //todo navegarAteInsercaoDeVenda

        vendas.getEstado().selecionaPeloTexto("MG");
        vendas.getPdvBuscar().buscar("PAP20-00001");
        getFinder().buscaPeloId("ui-id-6").click();
        getFinder().buscaPeloId("div_dados_venda_fiag_id").click();
        vendas.getVendedor().buscar("    ");
        getFinder().buscaPeloId("ui-id-8").click();
        getFinder().buscaPeloId("tipo_plano_clone1").click();
        getFinder().buscaPeloNomeDaClasse("botaoInsere").click();
        vendas.getPlano().selecionaPeloTexto("CONTROLE FATURA 1GB - R$44.99");
        vendas.getIccid().digita("89559461523041085163");
        getFinder().buscaPeloId("vese_fatura_vencimento11").click();
        vendas.getVencimentoFatura().escolhe("1");
        //Dados do cliente
    vendas.getCpf().digita("86253520490");
        vendas.salvar();
        Assert.assertTrue(vendas.getCpf().verificaTextoNosAtributosDoCampo("Informe o CPF;"));
        vendas.getNome().digita("Jose"+"Teste:@#$%&1ª2º3êó;;");
        vendas.salvar();
        Assert.assertTrue(vendas.getNome().verificaTextoNosAtributosDoCampo("Informe o nome;"));
        vendas.getNomeMae().digita("Lia");
        vendas.salvar();
        Assert.assertTrue(vendas.getNomeMae().verificaTextoNosAtributosDoCampo("Informe o Nome da Mãe;"));
        vendas.getDataNascimento().digita("28091993");
        vendas.salvar();
        Assert.assertTrue(vendas.getDataNascimento().verificaTextoNosAtributosDoCampo("Informe a Data de Nascimento;"));
        vendas.getSexo().escolhe("0");
        vendas.getCep().digita("13500313");
        vendas.salvar();
        Assert.assertTrue(vendas.getCep().verificaTextoNosAtributosDoCampo("Informe o CEP;"));
        vendas.salvar();
        vendas.getUf().digita("MT");
        vendas.salvar();
        vendas.getCidade().digita("");
        vendas.getEndereco().digita("");
        vendas.getNumero().digita("665");
        vendas.getBairro().digita("Aero Rancho");
        vendas.getComplemento().digita("Mercado");
        vendas.getTelefone1().digita("6792149043");
        Assert.assertTrue(vendas.getCep().verificaTextoNosAtributosDoCampo("Informe o Telefone;"));
        vendas.salvar();
        vendas.getEmail().digita("felipe@gmail.com");
        Assert.assertTrue(vendas.getEmail().verificaTextoNosAtributosDoCampo("Campo obrigatório para vendas com fatura por email;"));
        vendas.getTelefone2().digita("67992149043");
        vendas.salvar();
        getFinder().buscaPeloId("btnSalvar").click();

        //Mensagem de campo obrigatório
       ;
        //Mensagem de Erro
        Assert.assertTrue(vendas.verificaBoxErroTemMensagem("É necessário lançar pelo menos um serviço"));

        vendas.salvar();
    }
}