package br.com.testes.vivogo;

import br.com.apps.vivogo.login.LoginSyscor;
import br.com.apps.vivogo.paginas.ContasAPagar;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ContasAPagarTest {

	private LoginSyscor login;
	private ContasAPagar contas;

	@Before
	public void setUp() throws Exception {
		login = new LoginSyscor();
		login.logar();
		
		contas = new ContasAPagar();

	}

	@After
	public void tearDown() throws Exception {
		login.fecharNavegador();
	}

	@Test
	public void testDeveClicarEmBuscar() {
		//Menu.menu().listarContasAPagar();
		contas.buscar();

		contas.comDataInicio("01/11/2015").comDataFim("05/11/2015").salvar();
		
	}

}
