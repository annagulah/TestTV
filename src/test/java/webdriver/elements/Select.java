package webdriver.elements;

import org.openqa.selenium.By;

/**
 * Created by anna on 13.10.2016.
 */
public class Select extends BaseElement{

    /**
     *
     * @param locator
     * @param name
     */


    public Select(final By locator, final String name) {
        super(locator, name);
    }

    public Select(String string, String name) {
        super(string, name);
    }

    protected String getElementType() {
        return getLoc("loc.select");
    }

    public boolean selected(){
        return this.getElement().isSelected();

    }


}
