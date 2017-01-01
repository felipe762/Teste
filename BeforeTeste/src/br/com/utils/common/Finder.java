package br.com.utils.common;

import br.com.utils.exceptions.DriverNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class Finder {
	
	private By by;
	private WebDriverWait wait;

	public WebElement buscaPeloId(String id) {
		this.temDriver();
		by = By.id(id);
		return buscaElementoQuandoDisponivel();
	}
	
	public WebElement buscaPeloName(String name) {
		this.temDriver();
		by = By.name(name);
		return buscaElementoQuandoDisponivel();
		
	}
	
	public WebElement buscaPeloNomeDaClasse(String className) {
		this.temDriver();
		by = By.className(className);
		return buscaElementoQuandoDisponivel();
		
	}
	
	public List<WebElement> buscaTodosPeloNomeDaClasse(String className) {
		this.temDriver();
		return Page.driver.findElements(By.className(className));
	}
	
	public List<WebElement> buscaTodosPeloName(String name) {
		this.temDriver();
		by = By.name(name);
		wait = new WebDriverWait(Page.driver, Page.timeOutInSeconds);
		
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
	}
		
	public void isDriver() throws DriverNotFoundException {
		if (Page.driver == null) {
			throw new DriverNotFoundException();
		}
	}
	
	public WebElement buscaElementoQuandoDisponivel() {
		wait = new WebDriverWait(Page.driver, Page.timeOutInSeconds);
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	private void temDriver() {
		try {
			isDriver();
		} catch (DriverNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
}