package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;
/**
 * Created by anna on 13.10.2016.
 */
public class PodborModel extends BaseForm {
    private Button model = new Button(By.xpath("//span[.='Samsung']"),"model");

    public PodborModel() {
        super(By.xpath("//span[.='Samsung']"), "model");
        model.click();
        browser.waitForPageToLoad();
    }

    public void assertModel (){
        Label lblModel = new Label(By.xpath(".//*[@id='schema-tags']//span[.='Samsung']"),"model lbl");
        lblModel.waitForIsElementPresent();
        assert(lblModel.isPresent());
    }
}
