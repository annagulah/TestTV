package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;

/**
 * Created by anna on 12.10.2016.
 */
public class RazdelTV extends BaseForm {
    private Button btnTV = new Button(By.xpath("//a[.='Телевизоры']"), "TV");

    public RazdelTV() {
        super(By.xpath("//a[.='Телевизоры']"), "TV");
        btnTV.click();
        browser.waitForPageToLoad();
    }
}
