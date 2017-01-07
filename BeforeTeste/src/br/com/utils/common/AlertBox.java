package br.com.utils.common;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertBox {

	public static void checkAlert() {
	    try {
	        WebDriverWait wait = new WebDriverWait(Page.driver, Page.timeOutInSeconds);
	        wait.until(ExpectedConditions.alertIsPresent());
	        Alert alert = Page.driver.switchTo().alert();
	        alert.accept();
	    } catch (Exception e) {
	        //exception handling
	    }
	}
	
}
