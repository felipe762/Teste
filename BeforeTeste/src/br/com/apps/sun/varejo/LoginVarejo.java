package br.com.apps.sun.varejo;

import br.com.utils.common.Page;
import org.openqa.selenium.WebElement;

public class LoginVarejo extends Page {
	private WebElement selecione;
	private WebElement login;
	private WebElement password;

	@Override
	public void initializeFields() {
		abrirNavegador().get(getPropSun().getProperty("SUN_URL"));
		selecione = getFinder().buscaPeloName(getPropSun().getProperty("CAMPO_CANAL_VAREJO"));
		login = getFinder().buscaPeloName(getPropSun().getProperty("CAMPO_RECPF_VAREJO"));
		password = getFinder().buscaPeloName(getPropSun().getProperty("CAMPO_SENHA_VAREJO"));
	}
	public void logar() {
		selecione.sendKeys(getPropSun().getProperty("USUARIO_CANAL_VAREJO"));
		login.sendKeys(getPropSun().getProperty("USUARIO_RECPF_VAREJO"));
		password.sendKeys(getPropSun().getProperty("USUARIO_SENHA_VAREJO"));
		password.submit();
	}
}
