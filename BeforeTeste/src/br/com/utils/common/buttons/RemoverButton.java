package br.com.utils.common.buttons;


import br.com.utils.common.AlertBox;
import br.com.utils.common.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RemoverButton extends Button {

	public RemoverButton() {
		className = "botaoRemove";
	}

	public void remover(String valor) {

		List<WebElement> linhas = buscarLinhasDaListagemPelaClasse("item");
		
		
		String id = "";
		for (WebElement linha : linhas) {
			String idRetornado = buscarIdDaListagemPeloValor(linha, valor);
			if (idRetornado != null) {
				id = idRetornado;
			}

		}

		marcarCheckboxComId("delReg[]", id);
		clicar();
		AlertBox.checkAlert();
	}

	private void marcarCheckboxComId(String name, String value) {

		List<WebElement> itens = Page.getDriver().findElements(By.name(name));

		for (WebElement item : itens) {
			if (item.getAttribute("value").contains(value)) {
				item.click();
			}
		}

	}

	private List<WebElement> buscarLinhasDaListagemPelaClasse(String classe) {
		WebDriverWait wait = new WebDriverWait(Page.driver, Page.timeOutInSeconds);
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className(classe)));
	}

	private String buscarIdDaListagemPeloValor(WebElement linha, String valor) {
		
		if (linha.getText().contains(valor)) {
			String[] colunas = linha.getText().split("\n");
			String[] oldLayout = colunas[0].split(" "); 
			colunas[0] = oldLayout[0];
			return colunas[0];
		}
		return null;
	}

}
