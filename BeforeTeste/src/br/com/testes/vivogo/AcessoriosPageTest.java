package br.com.testes.vivogo;

import static org.junit.Assert.*;

import br.com.apps.vivogo.login.LoginSyscor;
import br.com.apps.vivogo.paginas.AcessoriosPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AcessoriosPageTest {
	
	private LoginSyscor login;
	private AcessoriosPage acessorios;
	
	@Before
	public void setUp() {
		login = new LoginSyscor();
		login.logar();
		acessorios = new AcessoriosPage();
	}

	@After
	public void tearDown() {
		login.fecharNavegador();
	}
	
	@Test
	public void deveAbrirPaginaDeAcessorios() {
		// GIVEN / ARRANGE
		acessorios.navegarDoInicioParaListagemDeAcessorios();
	
		// ACT / WHEN
		boolean isListagem = acessorios.containsNoBody("Listagem de Acessórios");
		
		// ASSERT / THEN
		assertTrue(isListagem);	
	}
	
	@Test
	public void deveCadastrarUmAcessorio() {
		
		acessorios.navegarDoInicioParaListagemDeAcessorios();
		acessorios.cadastrar();
		
		String nomeAcessorio = "produto item213";
		acessorios.digitaNome(nomeAcessorio).digitaNCM("01012100").selecionaGrupoAcessorios("CARTÃO").salvar();
		
		boolean isListagem = acessorios.containsNoBody("Listagem de Acessórios");
		
		assertTrue(isListagem);
		acessorios.botaoRemover.remover(nomeAcessorio);
	}
	
	
	@Test
	public void deveBuscarUmAcessorio() {
		
		acessorios.navegarDoInicioParaListagemDeAcessorios();
		acessorios.buscar();
		
		String nomeAcessorio = "NECESSAIRE";
		acessorios.digitaNome(nomeAcessorio);
		acessorios.salvar();
		
		boolean estaNaLista = acessorios.verificaItemNaListagem(nomeAcessorio);
		assertTrue(estaNaLista);
	}
	
	@Test //NOTEM QUE PODEMOS MELHORAR ESSE CODIGO ATRIBUINDO AS STRINGS REPETIDAS EM VARIAVEIS
	public void deveTestarOModuloDeAcessorios() {
		
		String nomeAcessorio = "FONES DE OUVIDOS BATUTAS";

		//testa se esta na listagem
		acessorios.navegarDoInicioParaListagemDeAcessorios();
		boolean isListagem = acessorios.containsNoBody("Listagem de Acessórios");
		assertTrue(isListagem);	
		
		//testa cadastro sem preencher o formulario
		acessorios.cadastrar().salvar();

		assertTrue(acessorios.getNome().verificaTextoNosAtributosDoCampo("Campo obrigatório;"));
		assertTrue(acessorios.getNcm().verificaTextoNosAtributosDoCampo("Código NCM obrigatório;"));
		assertTrue(acessorios.getGrupoAcessorios().verificaTextoNosAtributosDoCampo("Campo obrigatório;"));
		
		//testa o preenchimento e save do formulario
		acessorios.digitaNome(nomeAcessorio).digitaNCM("10203040").selecionaGrupoAcessorios("CARTÃO").salvar();
		isListagem = acessorios.containsNoBody("Listagem de Acessórios");
		assertTrue(isListagem);	
		
		//testa busca por um item
		acessorios.buscar();
		acessorios.digitaNome(nomeAcessorio).salvar();
		
		boolean estaNaLista = acessorios.verificaItemNaListagem(nomeAcessorio);
		assertTrue(estaNaLista);
		
		//testa a limitacao de nao cadastrar um acessorio com mesmo nome
		//acessorios.navegarListagemDeAcessorios();
		acessorios.cadastrar();
		acessorios.digitaNome(nomeAcessorio).digitaNCM("10203041").selecionaGrupoAcessorios("CARTÃO").salvar();
		assertTrue(acessorios.getNome().verificaTextoNosAtributosDoCampo("Nome de acessório já cadastrado!;"));
		
		//testa remocao
		//acessorios.navegarListagemDeAcessorios();
		isListagem = acessorios.containsNoBody("Listagem de Acessórios");
		assertTrue(isListagem);	
		acessorios.botaoRemover.remover(nomeAcessorio);
		acessorios.buscar();
		acessorios.digitaNome(nomeAcessorio).salvar();
		estaNaLista = acessorios.verificaItemNaListagem(nomeAcessorio);
		assertFalse(estaNaLista);	
	}
	

}
