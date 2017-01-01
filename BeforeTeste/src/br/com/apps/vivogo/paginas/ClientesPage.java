package br.com.apps.vivogo.paginas;

import br.com.utils.common.Page;
import br.com.utils.common.buttons.Button;
import br.com.utils.common.fields.RadioBox;
import br.com.utils.common.fields.SelectBox;
import br.com.utils.common.fields.Text;

public class ClientesPage extends Page {
	
	private Button buscar;
	private Button editar;
	private RadioBox tipo;
	private RadioBox sexo;
	private Text cpf;
	private Text nome;
	private Text profissao;
	private SelectBox estadoCivil;
	private SelectBox escolaridade;
	private SelectBox nacionalidade;
	private Text dataNascimento;
	private Text rg;
	private Text orgaoEmissor;
	private Text filiacao;
	private Text cep;
	private Text responsavelLegal;
	private Text procurador;
	private Text inscricaoEstadual;
	private SelectBox uf;
	private SelectBox cidade;
	private Text numero;
	private Text complemento;
	private Text celular;
	private Text email;
	private Text cliente;
	private Text fax;
	private Text contato;
	private Text observacao;
	private Text restricao;
	private SelectBox carteiraCliente;
	private SelectBox mensagemPromocional;
	private SelectBox origemCadastro;
	private SelectBox estado;
	private Text rua;

	@Override
	public void initializeFields() {
		tipo = new RadioBox();
		tipo.set(getPropVivoGo().getProperty("CLIENTE-RADIOBOX__TIPO"));
	
		cpf = new Text();
		cpf.set(getPropVivoGo().getProperty("CLIENTE-CAMPO__CPF"));
		
		nome = new Text();
		nome.set(getPropVivoGo().getProperty("CLIENTE-CAMPO__NOME"));

		rg = new Text();
		rg.set(getPropVivoGo().getProperty("CLIENTE-CAMPO__RG"));

		orgaoEmissor = new Text();
		orgaoEmissor.set(getPropVivoGo().getProperty("CLIENTE-CAMPO__ORGAO_EMISSOR"));

		filiacao = new Text();
		filiacao.set(getPropVivoGo().getProperty("CLIENTE-CAMPO__FILIACAO"));

		escolaridade = new SelectBox();
		escolaridade.set(getPropVivoGo().getProperty("CLIENTE-SELECT__ESCOLARIDADE"));

		estadoCivil = new SelectBox();
		estadoCivil.set(getPropVivoGo().getProperty("CLIENTE-SELECT__ESTADO_CIVIL"));

		profissao = new Text();
		profissao.set(getPropVivoGo().getProperty("CLIENTE-CAMPO__PROFISSAO"));
		
		dataNascimento = new Text();
		dataNascimento.set(getPropVivoGo().getProperty("CLIENTE-CAMPO__DATA_NASCIMENTO"));

		sexo = new RadioBox();
		sexo.set(getPropVivoGo().getProperty("CLIENTE-RADIOBOX__SEXO"));

		nacionalidade = new SelectBox();
		nacionalidade.set(getPropVivoGo().getProperty("CLIENTE-SELECT__NACIONALIDADE"));

		responsavelLegal = new Text();
		responsavelLegal.set(getPropVivoGo().getProperty("CLIENTE-CAMPO__RESPONSAVEL_LEGAL"));

		procurador = new Text();
		procurador.set(getPropVivoGo().getProperty("CLIENTE-CAMPO__PROCURADOR"));

		inscricaoEstadual = new Text();
		inscricaoEstadual.set(getPropVivoGo().getProperty("CLIENTE-CAMPO__INSCRICAO_ESTADUAL"));

		cep = new Text();
		cep.set(getPropVivoGo().getProperty("CLIENTE-CAMPO__CEP"));
		
		uf = new SelectBox();
		uf.set(getPropVivoGo().getProperty("CLIENTE-SELECT__UF"));
		
		cidade = new SelectBox();
		cidade.set(getPropVivoGo().getProperty("CLIENTE-SELECT__CIDADE"));
		
		numero = new Text();
		numero.set(getPropVivoGo().getProperty("CLIENTE-CAMPO__NUMERO"));

		complemento = new Text();
		complemento.set(getPropVivoGo().getProperty("CLIENTE-CAMPO__COMPLEMENTO"));

		email = new Text();
		email.set(getPropVivoGo().getProperty("CLIENTE-CAMPO__EMAIL"));

		celular = new Text();
		celular.set(getPropVivoGo().getProperty("CLIENTE-CAMPO__CELULAR"));

		cliente = new Text();
		cliente.set(getPropVivoGo().getProperty("CLIENTE-CAMPO__TELEFONE"));

		fax = new Text();
		fax.set(getPropVivoGo().getProperty("CLIENTE-CAMPO__FAX"));

		contato = new Text();
		contato.set(getPropVivoGo().getProperty("CLIENTE-CAMPO__CONTATO"));

		observacao = new Text();
		observacao.set(getPropVivoGo().getProperty("CLIENTE-CAMPO__OBSERVACAO"));

		restricao = new Text();
		restricao.set(getPropVivoGo().getProperty("CLIENTE-SELECT__RESTRICAO"));

		carteiraCliente = new SelectBox();
		carteiraCliente.set(getPropVivoGo().getProperty("CLIENTE-SELECT__CARTEIRA_CLIENTE"));

		mensagemPromocional	= new SelectBox();
		mensagemPromocional.set(getPropVivoGo().getProperty("CLIENTE-SELECT__MENSAGENS_PROMOCIONAIS"));

		origemCadastro = new SelectBox();
		origemCadastro.set(getPropVivoGo().getProperty("CLIENTE-SELECT__ORIGEM_CADASTRO"));


		buscar = new Button();
		buscar.comId("btnBuscar");
		
		editar = new Button();
		editar.comClasse("botaoEdita");
	}
	
	public RadioBox getTipo() {
		return tipo;
	}
	
	public Text getCpf() {
		return cpf;
	}
	
	public Text getNome() {
		return nome;
	}

	public SelectBox getEscolaridade() { return escolaridade;}

	public Text getFiliacao() { return filiacao;}

	public Text getResponsavelLegal(){return responsavelLegal;}

	public Text getInscricaoEstadual(){return inscricaoEstadual;}

	public SelectBox getEstado(){ return estado;}



	public Text getProcurador(){return procurador;}
	
	public SelectBox getEstadoCivil() {
		return estadoCivil;
	}
	public Text getProfissao(){ return  profissao;}

	public Text getRua(){return rua;}

	public RadioBox getSexo(){return sexo;}

	public SelectBox getNacionalidade(){return nacionalidade;}
	
	public Text getDataNascimento() {
		return dataNascimento;
	}

	public Text getRG() {
		return rg;
	}

	public Text getOrgaoEmissor() {
		return orgaoEmissor;
	}

	public Text getCEP() {
		return cep;
	}

	public SelectBox getUf() {
		return uf;
	}

	public SelectBox getCidade() {
		return cidade;
	}

	public Text getNumero() {
		return numero;
	}

	public Text getComplemento(){return complemento;}
	
	public Text getCelular() {
		return celular;
	}

	public Button getBuscar() {
		return buscar;
	}
	
	public Button getEditar() {
		return editar; 
	}

	
	public void abrirMenuCliente() {
		getFinder().buscaPeloId(getPropVivoGo().getProperty("MENU_VENDA")).click();
		getFinder().buscaPeloId(getPropVivoGo().getProperty("SUBMENU_VENDA")).click();
		getFinder().buscaPeloId(getPropVivoGo().getProperty("SUB_SUBMENU_CLIENTE")).click();
	}

	public void inserirRegistro(){
		getFinder().buscaPeloId(getPropVivoGo().getProperty("CLIENTE_INSERIR_REGISTRO")).click();
	}

	public void inserirPF(String escolhe, String cpf){
		tipo.escolhe("0");
		getFinder().buscaPeloId("cli_cpf").sendKeys("010.528.351-71");
	}
	
}
