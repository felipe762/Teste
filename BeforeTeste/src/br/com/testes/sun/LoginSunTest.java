package br.com.testes.sun;

import br.com.apps.sun.paginas.LoginSun;
import org.junit.After;
import org.junit.Test;

import javax.swing.*;

import static javax.swing.JOptionPane.ERROR_MESSAGE;


public class LoginSunTest {

    private LoginSun login;
   // private ClientesPage clientes;

    @Test
    public void init() {
      //  class LoginSunTest clientes;
        try {
            login = new LoginSun();
            login.logar();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Não foi possível prosseguir com o teste: \n" + e.getMessage(),
                    "Erro", ERROR_MESSAGE);
        }}
    @After
    public void tearDown() throws Exception {
        login.fecharNavegador();
    }
}
       	/* clientes = new ClientesPage();
    }
@Test
clientes = new ClientesPage();
public void inserirClientePF() {
    clientes.abrirMenuCliente();
}

		clientes.getOrgaoEmissor().digita("SSP");
		clientes.getFiliacao().digita("pia");
		clientes.getEscolaridade().selecionaPeloTexto("Doutorado");
		clientes.getEstadoCivil().selecionaPeloTexto("Solteiro");
		clientes.getProfissao().digita("Tester");
		clientes.getDataNascimento().digita("1993");
		clientes.getSexo().escolhe("0");
		clientes.getNacionalidade().selecionaPeloTexto("Brasileiro");
		clientes.getResponsavelLegal().digita("Pai");
    	clientes.getProcurador().digita("test");
		clientes.getInscricaoEstadual().digita("89796");
		clientes.getCEP().digita("79020-135");
		clientes.getEstado().selecionaPeloTexto("MS");
		clientes.getCidade().selecionaPeloTexto("Campo Grande");
		clientes.getNumero().digita("3456");
		clientes.listarClientes();
		clientes.cadastrar();
		clientes.salvar();
		assertTrue(clientes.verificaBoxErroTemMensagem("Campos obrigat&oacute;rios n&atilde;o foram preenchidos!"));
		clientes.getTipo().escolhe("0");
		clientes.getCpf().digita("489.227.731-20");
		clientes.getNome().digita("Rafael");
		clientes.getRG().digita("1587173");
		clientes.getOrgaoEmissor().digita("ssp/ms");
		clientes.getEstadoCivil().selecionaPeloTexto("Solteiro(a)");
		clientes.getDataNascimento().digita("24/12/1991");
		clientes.getCEP().digita("79092-251");
		clientes.getNumero().digita("178");
		clientes.getCelular().digita("67 92144-884");
    	clientes.getTelefoneResidencia().digita("67 3385-1193");
		clientes.salvar();
		clientes.buscar();
		clientes.getCpf().digita("489.227.731-20");
		clientes.getBuscar().clicar();
		clientes.containsNoBody("Listagem de Clientes");
		clientes.getEditar().clicar();
		assertTrue(clientes.getTipo().verificaSelecionado("0"));
		assertTrue(clientes.getCpf().temValor("489.227.731-20"));
		clientes.salvar();
		clientes.containsNoBody("Listagem de Clientes");
		clientes.buscar();
		clientes.getCpf().digita("489.227.731-20");
		clientes.getBuscar().clicar();
		clientes.botaoRemover.remover("Rafael");


*/