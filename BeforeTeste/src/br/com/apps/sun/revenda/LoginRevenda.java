package br.com.apps.sun.revenda;

import br.com.utils.common.Page;
import org.openqa.selenium.WebElement;

public class LoginRevenda extends Page {
	private WebElement selecione;
	private WebElement login;
	private WebElement password;

	@Override
	public void initializeFields() {
		abrirNavegador().get(getPropSun().getProperty("SUN_URL"));
		selecione = getFinder().buscaPeloName(getPropSun().getProperty("CAMPO_CANAL_REVENDA"));
		login = getFinder().buscaPeloName(getPropSun().getProperty("CAMPO_RECPF_REVENDA"));
		password = getFinder().buscaPeloName(getPropSun().getProperty("CAMPO_SENHA_REVENDA"));
	}
	public void logar() {
		selecione.sendKeys(getPropSun().getProperty("USUARIO_CANAL_REVENDA"));
		login.sendKeys(getPropSun().getProperty("USUARIO_RECPF_REVENDA"));
		password.sendKeys(getPropSun().getProperty("USUARIO_SENHA_REVENDA"));
		password.submit();
	}
}
