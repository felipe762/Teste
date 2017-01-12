package br.com.apps.sun.pap;

import br.com.utils.common.Page;
import br.com.utils.common.fields.Dropdown;
import br.com.utils.common.fields.RadioBox;
import br.com.utils.common.fields.SelectBox;
import br.com.utils.common.fields.Text;
import javafx.scene.control.RadioButton;

public class VendasPap extends Page {

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



	public SelectBox getEstado() {return estado;}
	public Dropdown getPdv() {
		sleep(1000);
		return pdv;}
	public Dropdown getVendedor() {
		sleep(1000);
		return vendedor;
	}
	public Text getObservação(){
		sleep(1000);return observação; }
	public SelectBox getDdd(){
		sleep(1000);return ddd;}
//    public RadioBox getServico(){
//		CadastroUsuarioPapTest(1000);return servico;    }
    public SelectBox getPlano(){
		sleep(1000);
        return plano;
    }
    public Text getIccid(){
		sleep(1000);
    	return iccid;
    }
    public RadioBox getVencimentoFatura(){

		sleep(1000);return vencimentoFatura;
    }
    public Text getCpf(){

		sleep(1000);return cpf;
    }
    public Text getNome(){

		sleep(1000);return nome;
    }
    public Text getNomeMae(){
		sleep(1000);
        return nomeMae;
    }
    public Text getDataNascimento(){

		sleep(1000);
		return dataNascimento;
    }
    public RadioBox getSexo(){
		sleep(1000);
    	return sexo;}
    public Text getCep(){
		sleep(1000);
    	return cep;
    }
    public SelectBox getUf(){
		sleep(1000);
    	return uf;}
    public SelectBox getCidade(){
		sleep(1000);
    	return cidade;
    }
    public Text getEndereco(){
		sleep(1000);
    	return endereco;
    }
    public Text getNumero(){
		sleep(1000);
        return numero;
    }
    public Text getBairro(){
		sleep(1000);
    	return bairro;
    }
    public Text getComplemento(){
		sleep(1000);
		return complemento;
    }
    public Text getEmail(){
		sleep(1000);
    	return email;
    }
    public Text getTelefone1(){
		sleep(1000);
        return telefone1;
    }
    public Text getTelefone2(){
		sleep(1000);
    	return telefone2;
    }
}


