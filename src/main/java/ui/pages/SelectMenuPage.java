package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.drivers.Driver;
import ui.helper.WebElementHelper;

public class SelectMenuPage {

    public SelectMenuPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "oldSelectMenu")
    public WebElement oldStyleSelectMenu;

    @FindBy(id = "react-select-3-input")
    public WebElement selectValueInput;
}
