package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.Select;
import webdriver.elements.TextBox;

/**
 * Created by gyul-akhmedova-av on 14.10.2016.
 */
public class PodborRaz extends BaseForm {

    private Select raz = new Select(By.xpath("//select[contains(@data-bind, 'from')]//option[@value='390']"),"razmer tv");
    private Select raz1 = new Select(By.xpath("//select[contains(@data-bind, 'to')]//option[@value='420']"),"razmer tv");

    public PodborRaz() {
        super(By.xpath("//select[contains(@data-bind, 'from')]//option[@value='390']"), "razmer tv");
        raz.click();
        raz1.click();
        browser.waitForPageToLoad();
    }

    public void assertRaz () {
        Label lblRaz = new Label(By.xpath("//span[.='39\" — 42\"']"),"model diag");
        lblRaz.waitForIsElementPresent();
        assert(lblRaz.isPresent());
    }

}
