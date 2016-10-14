package demo.test.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import webdriver.BaseForm;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

/**
 * Created by anna on 13.10.2016.
 */
public class PodborData extends BaseForm {
    private TextBox dataVyhoda = new TextBox(By.xpath("//input[@placeholder='2010']"),"dataVyhoda");
    //private Label lblPrice = new Label(By.xpath("//span[.='до 1 000']"),"price lbl");

    public PodborData() {
        super(By.xpath("//input[@placeholder='2010']"), "dataVyhoda");
        dataVyhoda.type("2013");

    }

    public void assertData (){
        Label lblData = new Label(By.xpath("//span[.='от 2013']"),"data lbl");
        lblData.waitForIsElementPresent();
        assert(lblData.isPresent());
    }


    public void ForData(String text) {
        dataVyhoda.type(text);
        browser.waitForPageToLoad();
    }

}
