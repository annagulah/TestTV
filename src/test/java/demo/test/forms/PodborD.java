package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.Select;
import webdriver.elements.TextBox;

/**
 * Created by anna on 13.10.2016.
 */
public class PodborD extends BaseForm {
    private Button diag = new Button(By.xpath("//*[@class='schema-filter__group']/div[2]/select"),"diagonal42");


    public PodborD() {
        super(By.xpath("//*[@class='schema-filter__group']/div[2]/select"), "diagonal42");
        diag.click();

        //diag.SelectByText("18%");

  /*    driver.findElement(By.id("cityFieldR")).click();
        Select dropdown=new Select((WebElement) By.id("cityFieldR"));
        dropdown.selectByValue("Ангарск");
  */
        browser.waitForPageToLoad();

    }



}

