package br.com.utils.common.fields;


import br.com.utils.common.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class Field {
	private static final String AVISO_SUFIX = "Aviso";
	private String id;
	private String classe;
	private String name;
	private String valor;
	private String idAviso;
	private String atributo;
	
	public Field set(String identificador) {
		id = classe = name = identificador;
		atributo = "data-hint";
		idAviso = id + AVISO_SUFIX;
		
		return this;
	}
	
	public Field comId(String id) {
		this.id = id;
		return this;
	}

	public Field comClasse(String classe) {
		this.classe = classe;
		return this;
	}

	public Field comName(String name) {
		this.name = name;
		return this;
	}

	public Field comValor(String valor) {
		this.valor = valor;
		return this;
	}

	public Field comIdAviso(String idAviso) {
		this.idAviso = idAviso;
		return this;
	}

	public Field comAtributo(String atributo) {
		this.atributo = atributo;
		return this;
	}

	public String getId() {
		return id;
	}

	public String getClasse() {
		return classe;
	}

	public String getName() {
		return name;
	}

	public String getValor() {
		return valor;
	}

	public String getIdAviso() {
		return idAviso;
	}

	public String getAtributo() {
		return atributo;
	}
	
	@Override
	public String toString() {
		return "Campo [id=" + id + ", classe=" + classe + ", name=" + name + ", valor=" + valor + ", idAviso=" + idAviso
				+ ", atributo=" + atributo
				+ "]";
	}
	
	public boolean verificaTextoNosAtributosDoCampo(String mensagem) {
		WebDriverWait wait = new WebDriverWait(Page.driver, Page.timeOutInSeconds);
		
		return wait.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				WebElement button = driver.findElement(By.id(getIdAviso()));
				//System.out.println(button.getAttribute(getAtributo()));
				return button.getAttribute(getAtributo()).contains(mensagem);
			}
		});
	
	}
	
	
}
