package br.com.apps.vivogo.login;

import br.com.utils.common.Page;
import org.openqa.selenium.WebElement;

public class 	LoginSyscor extends Page {

	private WebElement login;
	private WebElement password;

	@Override
	public void initializeFields() {

		abrirNavegador().get(getPropVivoGo().getProperty("SYSCOR_URL"));

		login = getFinder().buscaPeloName(getPropVivoGo().getProperty("CAMPO_LOGIN"));
		password = getFinder().buscaPeloName(getPropVivoGo().getProperty("CAMPO_SENHA"));
	}


	public void logar() {
		login.sendKeys(getPropVivoGo().getProperty("USUARIO_LOGIN"));
		password.sendKeys(getPropVivoGo().getProperty("USUARIO_SENHA"));
		password.submit();
	}

}
