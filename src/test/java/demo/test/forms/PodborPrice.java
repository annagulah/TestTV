package demo.test.forms;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import webdriver.BaseForm;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

/**
 * Created by anna on 13.10.2016.
 */
public class PodborPrice extends BaseForm {
    private TextBox priceTo = new TextBox(By.xpath("//input[@placeholder='до']"),"toPrice");

    public PodborPrice() {
        super(By.xpath("//input[@placeholder='до']"), "toPrice");

        priceTo.type("1000");
        priceTo.sendKeys(Keys.ENTER);

    }

    public void assertPrice (){
        Label lblPrice = new Label(By.xpath("//span[.='до 1 000']"),"price lbl");
        lblPrice.waitForIsElementPresent();
        assert(lblPrice.isPresent());
    }


    public void ForPrice(String text) {
        priceTo.type(text);
        browser.waitForPageToLoad();
    }

}
