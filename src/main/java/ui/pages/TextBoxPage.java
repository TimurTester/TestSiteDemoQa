package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.drivers.Driver;
import ui.helper.WebElementHelper;

public class TextBoxPage {

    public TextBoxPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "userName")
    public WebElement fullNameInput;

    @FindBy(id = "userEmail")
    public WebElement emailInput;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressInput;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    WebElementHelper webElementHelper = new WebElementHelper();

    public TextBoxPage fillUpFullName( String fullName){
        webElementHelper.sendKeys(fullNameInput, fullName);
        return this;
    }

    public TextBoxPage fillUpEmail( String currentAddress){
        webElementHelper.sendKeys(emailInput, currentAddress);
        return this;
    }
    public TextBoxPage fillUpCurrentAddress( String currentAddress){
        webElementHelper.sendKeys(currentAddressInput, currentAddress);
        return this;
    }

    public TextBoxPage fillUpPermamentAddress( String currentAddress){
        webElementHelper.sendKeys(permanentAddressInput, currentAddress);
        return this;
    }

    public TextBoxPage clickSubmitBtn(){
        webElementHelper
                .scrollToElement(submitBtn)
                .click(submitBtn);
        return this;
    }

}
