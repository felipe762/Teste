package br.com.apps.vivogo.paginas;


import br.com.utils.common.Page;
import br.com.utils.common.buttons.Button;
import br.com.utils.common.fields.Text;

public class ContasAPagar extends Page {
	
	private Text dataInicio;
	private Text dataFim;

	public Page buscar() {
		sleep(500);
		Button buscar = new Button();
		buscar.comId("buscar-registroMenuModulo36");
		buscar.clicar();
		return this;
	}

	@Override
	public void initializeFields() {
		dataInicio = new Text();
		dataInicio.set("data_inicio");
		
		dataFim = new Text();
		dataFim.set("data_fim");
	}
	
	public ContasAPagar comDataInicio(String data) {
		dataInicio.digita(data);
		return this;
	}
	
	public ContasAPagar comDataFim(String data) {
		dataFim.digita(data);
		return this;
	}

}
