package br.com.apps.sun.pap;

import br.com.utils.common.Page;
import br.com.utils.common.fields.Dropdown;
import br.com.utils.common.fields.RadioBox;
import br.com.utils.common.fields.SelectBox;
import br.com.utils.common.fields.Text;

public class CadastroUsuario extends Page {

	/*private Text observação;
	private SelectBox ddd;
	private RadioBox servico;*/


	private SelectBox funcao;
	private Text nome;
	private Text re;
	private Text cpf;
	private Text celular;
	private Text email;
	private RadioBox acessoNacional;
	private RadioBox acessoRedes;

	@Override
	public void initializeFields() {

		funcao = new SelectBox();
		funcao.set("fun_id");

		nome = new Text();
		nome.set("us_nome");

		re = new Text();
		re.set("us_re");

		cpf = new Text();
		cpf.set("us_cpf");

		celular = new Text();
		celular.set("us_cel");

		email = new Text();
		email.set("us_email");

		acessoNacional = new RadioBox();
		acessoNacional.set("uf_all0");

		acessoRedes = new RadioBox();
		acessoRedes.set("reag_all0");
	}

    public SelectBox getFuncao(){
		sleep(1000);
    	return funcao;
    }
    public Text getNome(){
    	return nome;
	}
	public Text getRe(){
    	return re;
	}
	public Text getCpf(){
		return cpf;
	}
	public Text getCelular(){
		return celular;
	}
	public Text getEmail(){
		return email;
	}
	public RadioBox getAcessoNacional(){
		return acessoNacional;
	}
	public RadioBox getAcessoRedes(){
		return acessoRedes;
	}
}

