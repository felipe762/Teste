package br.com.utils.common.fields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.com.utils.common.Finder;
import br.com.utils.common.Page;

public class Text extends Field {
	
	private Finder finder;
	
	public Text() {
		finder = new Finder();
	}
	
	public void digita(String valor) {
		comValor(valor);
		finder.buscaPeloName(getName()).sendKeys(getValor());
	}
	
	public boolean temValor(String valorEsperado) {
		WebDriverWait wait = new WebDriverWait(Page.driver, Page.timeOutInSeconds);
		
		return wait.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				WebElement button = driver.findElement(By.name(getName()));
				return button.getAttribute("value").equals(valorEsperado);
			}
		});
	}
}
