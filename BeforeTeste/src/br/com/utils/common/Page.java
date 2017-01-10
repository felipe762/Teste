package br.com.utils.common;

import br.com.utils.Alt.GeraCPF;
import br.com.utils.common.fields.SelectBox;
import br.com.utils.common.buttons.Button;
import br.com.utils.common.buttons.RemoverButton;
import br.com.utils.exceptions.ExcecaoListagemSemElementos;
import br.com.utils.properties.PropConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Properties;

public abstract class Page {

	public static final String CLASSE_LISTAGEM = "item";
	public static int timeOutInSeconds = 30;
	public static WebDriver driver;
	private Finder finder;
	private PropConfig propConfig;
	private Contains contains;
	private Button salvar;
	private Button voltar;
	private Button cadastrar;
	private Button buscar;
	public RemoverButton botaoRemover;

	public Page() {
		finder = new Finder();
		contains = new Contains();
		propConfig = new PropConfig();
		
		salvar = new Button();
		salvar.comClasse("corBotaoOk");
		
		voltar = new Button();
		voltar.comId("btnVoltar");
		
		cadastrar = new Button();
		cadastrar.comClasse("corBotaoInsere");
		
		buscar = new Button();
		buscar.comClasse("corBotaoBusca");
		
		botaoRemover = new RemoverButton();

		initializeFields();
	}

	public WebDriver abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", getPropVivoGo().getProperty("CHROME_DRIVER"));
		System.setProperty("webdriver.chrome.driver", getPropSun().getProperty("CHROME_DRIVER"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public void fecharNavegador() {
		driver.close();
		AlertBox.checkAlert();
	}

	public abstract void initializeFields();

	protected Finder getFinder() {
		return finder;
	}

	protected Contains getContains() {
		return contains;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public Properties getPropVivoGo(){
		return propConfig.getPropVivoGo();
	}

	public Properties getPropSun(){

		return propConfig.getPropSun();
	}

	protected int getTimeout() {
		return timeOutInSeconds;
	}

	public boolean verificaBoxErroTemMensagem(String mensagem) {
		return finder.buscaPeloId("aviso").getText().contains(mensagem);
	}
	
	public Page salvar() {
		salvar.clicar();
		return this;
	}

	public Page voltar() {
		voltar.clicar();
		return this;
	}

	public Page cadastrar() {
		cadastrar.clicar();
		return this;
	}

	public Page buscar() {
		buscar.clicar();
		return this;
	}

	public boolean containsNoBody(String texto) {
		try {
			WebElement elementoBody = driver.findElement(By.tagName("body"));

			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
			Boolean temTexto = wait.until(ExpectedConditions.textToBePresentInElement(elementoBody, texto));
			return temTexto && driver.getPageSource().contains(texto);
		} catch (TimeoutException e) {
			System.out.println(texto + " nao encontrado na pagina!");
		}
		return false;
	}

	public boolean verificaItemNaListagem(String valor) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		try {
			 Thread.sleep(1000);
			List<WebElement> itens = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className(CLASSE_LISTAGEM)));
			for (WebElement item : itens) {
				if (item.getText().contains(valor)) {
					return true;
				}
			}

		} catch (ExcecaoListagemSemElementos e) {
			System.out.print(e.getMessage());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void sleep(long milissegundos) {
		try {
		    System.out.println("Parei por "+milissegundos+"ms");
			Thread.sleep(milissegundos);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
}
