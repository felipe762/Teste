package br.com.apps.sun.paginas;

import br.com.utils.common.Page;
import br.com.utils.common.fields.Dropdown;
import br.com.utils.common.fields.RadioBox;
import br.com.utils.common.fields.SelectBox;
import br.com.utils.common.fields.Text;
import junit.framework.Test;

public class VendasPageSun extends Page {

	private SelectBox estado;
	private Dropdown pdvBuscar;
	private Dropdown pdvEscolher;
	private Dropdown vendedor;
	private SelectBox Ddd;
	private RadioBox Servico;
	private SelectBox Plano;
	private Text iccid;
	private RadioBox vencimentoFatura;
	private Text cpf;
	private Text nome;
	private Text nomeMae;
	private Text dataNascimento;
	private RadioBox sexo;
	private Text cep;
	private Text uf;
	private Text cidade;
	private Text endereco;
	private Text numero;
	private Text bairro;
	private Text complemento;
	private Text email;
	private Text telefone1;
	private Text telefone2;

@Override
	public void initializeFields() {
		estado = new SelectBox();
		estado.set("ufVenda");

		pdvBuscar = new Dropdown();
		pdvBuscar.set("fiag_id_aux");

		pdvEscolher = new Dropdown();
		pdvEscolher.set("fiag_id_aux");

		vendedor = new Dropdown();
		vendedor.set("us_id_aux");

		Servico = new RadioBox();
		Servico.set("dadosServico");

		Plano = new SelectBox();
		Plano.set("pl_id1");

		iccid = new Text();
		iccid.set("vese_iccid1");


    //inserir ids aguardando subir no beta
vencimentoFatura = new RadioBox();
vencimentoFatura.set("vese_fatura_vencimento11");

	cpf = new Text();
	cpf.set("pess_cpf");

	nome = new Text();
	nome.set("pess_nome");

	nomeMae = new Text();
	nomeMae.set("pess_filiacao");

	dataNascimento = new Text();
	dataNascimento.set("pess_data_nasc");

	sexo = new RadioBox();
	sexo.set("");

	cep = new Text();
	cep.set("pess_cep");

	uf = new Text();
	uf.set("uf_id");

	cidade = new Text();
	cidade.set("cid_id");

	endereco = new Text();
	endereco.set("pess_rua");


	numero = new Text();
	numero.set("pess_num");

	bairro = new Text();
	bairro.set("pess_bairro");

	complemento = new Text();
	complemento.set("pess_compl");

	email = new Text();
	email.set("pess_email");

	telefone1 = new Text();
	telefone1.set("pess_tel");

	telefone2 = new Text();
	telefone2.set("pess_tel2");
}
	public void abrirInserirVendas() {
		getFinder().buscaPeloId("menu_7").click();
		getFinder().buscaPeloId("submenu_7_6").click();
		getFinder().buscaPeloId("GrupoMenuModulo22").click();
		sleep(500);
		getFinder().buscaPeloId("inserir-registroMenuModulo22").click();
	}

	public SelectBox getEstado() {
		return estado;
	}

	public Dropdown getPdvBuscar() {
		sleep(1000);
		return pdvBuscar;
	}

	public Dropdown getPdvEscolher() {

		return pdvEscolher;
	}
	public Dropdown getVendedor() {
		sleep(1000);
		return vendedor;
	}

	public RadioBox getServico() {
		return Servico;
	}

	public SelectBox getPlano() {
		sleep(1000);
		return Plano;
	}
	public Text getIccid(){
		return iccid;
	}

	public RadioBox getVencimentoFatura(){
		return vencimentoFatura;
	}
	public Text getCpf(){
		return cpf;
	}

	public Text getNome(){
		return nome;
	}
	public Text getNomeMae(){
		return nomeMae;
	}
	public Text getDataNascimento(){
		return dataNascimento;
	}
	public RadioBox getSexo(){
		return sexo;}
	public Text getCep(){
		return cep;
	}
	public Text getUf(){return uf;}
	public Text getCidade(){
		return cidade;
	}
	public Text getEndereco(){
		return endereco;
	}
	public Text getNumero(){
		return numero;
	}
	public Text getBairro(){
		return bairro;
	}
	public Text getComplemento(){
		return complemento;
	}
	public Text getEmail(){
	return email;
	}
	public Text getTelefone1(){
		return telefone1;
	}
	public Text getTelefone2(){
		return telefone2;
	}


}

