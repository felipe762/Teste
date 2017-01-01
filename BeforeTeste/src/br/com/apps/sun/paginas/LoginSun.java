package br.com.apps.sun.paginas;

import br.com.utils.common.Page;
import org.openqa.selenium.WebElement;

public class LoginSun extends Page {
	private WebElement selecione;
	private WebElement login;
	private WebElement password;

	@Override
	public void initializeFields() {
		abrirNavegador().get(getPropSun().getProperty("SUN_URL"));
		selecione = getFinder().buscaPeloName(getPropSun().getProperty("CAMPO_CANAL"));
		login = getFinder().buscaPeloName(getPropSun().getProperty("CAMPO_RECPF"));
		password = getFinder().buscaPeloName(getPropSun().getProperty("CAMPO_SENHA"));
	}
	public void logar() {
		selecione.sendKeys(getPropSun().getProperty("USUARIO_CANAL"));
		login.sendKeys(getPropSun().getProperty("USUARIO_RECPF"));
		password.sendKeys(getPropSun().getProperty("USUARIO_SENHA"));
		password.submit();
	}

}
