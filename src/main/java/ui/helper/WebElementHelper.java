package ui.helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.drivers.Driver;

import java.time.Duration;

public class WebElementHelper {
    public WebElementHelper waitForButtonToBeClickAble(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public WebElementHelper waitForElementToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public WebElementHelper click(WebElement element){
        waitForButtonToBeClickAble(element);
        element.click();
        return this;
    }

    public WebElementHelper sendKeys(WebElement element, String txt){
        waitForButtonToBeClickAble(element);
        element.sendKeys(txt);
        return this;
    }

    public WebElementHelper scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("argument[0].scrollIntoView(true)", element);
        return this;
    }
}
