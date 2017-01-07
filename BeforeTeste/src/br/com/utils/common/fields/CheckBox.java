package br.com.utils.common.fields;


import br.com.utils.common.Finder;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CheckBox extends Field {

    private Finder finder;

    public CheckBox(String name) {
        comName(name);
        finder = new Finder();
    }

    public void selecionar(String[] itens) {
        List<WebElement> checkboxs = finder.buscaTodosPeloName(getName());

        for (WebElement checkbox : checkboxs) {
            for (String item : itens) {
                if (checkbox.getAttribute("value").equals(item)) {
                    checkbox.sendKeys(Keys.SPACE);
                }
            }
        }
    }

}
