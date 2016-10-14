package demo.test.forms;

import org.openqa.selenium.By;

import org.testng.Assert;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

/**
 * Created by anna on 12.10.2016.
 */

public class FindKatalogMain extends BaseForm {
        private Button btnKatalog = new Button(By.xpath("//span[.='Каталог']"), "Catalog");


    public FindKatalogMain() {
        super(By.xpath("//span[.='Каталог']"), "Catalog");
        btnKatalog.click();
        browser.waitForPageToLoad();
    }


}
