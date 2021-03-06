package br.com.apps.sun.pappaginas;

import br.com.utils.common.Page;
import br.com.utils.common.fields.Dropdown;
import br.com.utils.common.fields.RadioBox;
import br.com.utils.common.fields.SelectBox;
import br.com.utils.common.fields.Text;
import javafx.scene.control.RadioButton;

public class VendasPageSun extends Page {

	private SelectBox estado;
	private Dropdown pdv;
	private Dropdown vendedor;
	private Text observação;
	private SelectBox ddd;
//	private RadioBox servico;
	private SelectBox plano;
	private SelectBox tiposervico;
	private Text iccid;
	private RadioBox vencimentoFatura;
	private Text cpf;
	private Text nome;
	private Text nomeMae;
	private Text dataNascimento;
	private RadioBox sexo;
	private Text cep;
	private SelectBox uf;
	private SelectBox cidade;
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

		pdv = new Dropdown();
		pdv.set("fiag_id_aux");

		vendedor = new Dropdown();
		vendedor.set("us_id_aux");

		observação = new Text();
		observação.set("vend_obs");

		ddd = new SelectBox();
		ddd.set("ddd_id_servico");

		//servico = new RadioBox();
		//servico.set("tipo_plano_clone1");

		plano = new SelectBox();
		plano.set("pl_id1");

		//tiposervico = new SelectBox();
		//tiposervico.set("se_id1");

		iccid = new Text();
		iccid.set("vese_iccid1");

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

		uf = new SelectBox();
		uf.set("uf_id");

		cidade = new SelectBox();
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
		getFinder().buscaPeloNomeDaClasse("GrupoMenuModulo22").click();
		sleep(500);
		getFinder().buscaPeloNomeDaClasse("inserir-registroMenuModulo22").click();
	}//

	public SelectBox getEstado() {return estado;}
	public Dropdown getPdv() {
		sleep(800);
		return pdv;}
	public Dropdown getVendedor() {
		sleep(800);
		return vendedor;
	}
	public Text getObservação(){
		sleep(800);return observação; }
	public SelectBox getDdd(){
		sleep(800);return ddd;}
//    public RadioBox getServico(){
//		sleep(800);return servico;    }
    public SelectBox getPlano(){
		sleep(800);
        return plano;
    }
    public Text getIccid(){
		sleep(800);
    	return iccid;
    }
    public RadioBox getVencimentoFatura(){

		sleep(800);return vencimentoFatura;
    }
    public Text getCpf(){

		sleep(800);return cpf;
    }
    public Text getNome(){

		sleep(800);return nome;
    }
    public Text getNomeMae(){
		sleep(800);
        return nomeMae;
    }
    public Text getDataNascimento(){

		sleep(800);
		return dataNascimento;
    }
    public RadioBox getSexo(){
		sleep(800);
    	return sexo;}
    public Text getCep(){
		sleep(800);
    	return cep;
    }
    public SelectBox getUf(){
		sleep(800);
    	return uf;}
    public SelectBox getCidade(){
		sleep(800);
    	return cidade;
    }
    public Text getEndereco(){
		sleep(800);
    	return endereco;
    }
    public Text getNumero(){
		sleep(800);
        return numero;
    }
    public Text getBairro(){
		sleep(800);
    	return bairro;
    }
    public Text getComplemento(){
		sleep(800);
		return complemento;
    }
    public Text getEmail(){
		sleep(800);
    	return email;
    }
    public Text getTelefone1(){
		sleep(800);
        return telefone1;
    }
    public Text getTelefone2(){
		sleep(800);
    	return telefone2;
    }
}


