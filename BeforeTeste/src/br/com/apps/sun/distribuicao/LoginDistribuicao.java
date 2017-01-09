package br.com.apps.sun.distribuicao;

import br.com.utils.common.Page;
import org.openqa.selenium.WebElement;

public class LoginDistribuicao extends Page {
	private WebElement selecione;
	private WebElement login;
	private WebElement password;

	@Override
	public void initializeFields() {
		abrirNavegador().get(getPropSun().getProperty("SUN_URL"));
		selecione = getFinder().buscaPeloName(getPropSun().getProperty("CAMPO_CANAL_DISTRIBUICAO"));
		login = getFinder().buscaPeloName(getPropSun().getProperty("CAMPO_RECPF_DISTRIBUICAO"));
		password = getFinder().buscaPeloName(getPropSun().getProperty("CAMPO_SENHA_DISTRIBUICAO"));
	}
	public void logar() {
		selecione.sendKeys(getPropSun().getProperty("USUARIO_CANAL_DISTRIBUICAO"));
		login.sendKeys(getPropSun().getProperty("USUARIO_RECPF_DISTRIBUICAO"));
		password.sendKeys(getPropSun().getProperty("USUARIO_SENHA_DISTRIBUIÇÃO"));
		password.submit();
	}
}
