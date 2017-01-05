package br.com.utils.common.fields;

import java.util.List;

import br.com.utils.Config;
import br.com.utils.common.Delayer;
import br.com.utils.common.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Dropdown extends Field {
	private String classDropdown = "ui-autocomplete";
	private WebDriverWait wait;

	public void buscar(String busca) {
		this.preencherInputParaBuscaDasOpcoes(busca);

	}

	public void escolher( String escolha) {
		this.comValor(escolha);
		this.escolherOpcaoDesejadaAposCarregarOpcoes();
	}
	private void preencherInputParaBuscaDasOpcoes(String busca) {
		this.criarEsperaNoDriver();

		WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(By.name(getName())));
		input.sendKeys(busca);

	}

	private void criarEsperaNoDriver() {
		this.wait = new WebDriverWait(Page.driver, Page.timeOutInSeconds);
	}

	private void escolherOpcaoDesejadaAposCarregarOpcoes() {
		
		WebElement usedDropdown = waitForDropdownData();
		clickOnDropdownOption(usedDropdown);
	}

	private WebElement waitForDropdownData() {
		List<WebElement> autocompletes = Page.driver.findElements(By.className(classDropdown));			
		Delayer delayer = new Delayer(100);
	
		while (delayer.getDiffWithCurrentTime() <= Config.DROPDOWN_TIMEOUT) {
			for (WebElement autocomplete : autocompletes) {	
				String campo = autocomplete.getAttribute("ui-autocomplete-reference");
				
				if (campo != null) {
					if (campo.equals(getId().replace("_aux", ""))) {
						return autocomplete;
					}
				}
			}
		}
		return null;
	}
	
	private void clickOnDropdownOption(WebElement usedDropdown) {
		if (usedDropdown != null) {
			List<WebElement> opcoes = usedDropdown.findElements(By.tagName("li"));
			for (WebElement opcao : opcoes) {
				if (opcao.getText().equals(getValor())) {
					opcao.click();
				}
			}
		}
	}
	
	public boolean verificaValor(String valor) {
		this.criarEsperaNoDriver();

		WebElement campo = Page.driver.findElement(By.id(getId().replace("_aux", "")));
		return campo.getAttribute("value").contains(valor);
	}
	
}