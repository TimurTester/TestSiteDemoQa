package ui.helper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.drivers.Driver;

import java.time.Duration;

public class AlertHelper {

    private WebDriver driver;

    public Alert getAlert(){
        return Driver.getDriver().switchTo().alert();
    }

    public void acceptAlert(){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.alertIsPresent());
        if(!isAlertPresent()){
            return;
        }
        getAlert().accept();
    }

    public void dismissAlert(){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.alertIsPresent());
        if(!isAlertPresent()){
            return;
        }
        getAlert().dismiss();
    }

    public void sendKeysAlert(String txt){
        if(!isAlertPresent()){
            return;
        }
        getAlert().sendKeys(txt);
        acceptAlert();
    }

    public boolean isAlertPresent(){
        try {
            Driver.getDriver().switchTo().alert();
            return true;
        } catch (NoAlertPresentException e){
            e.printStackTrace();
            return false;
        }
    }


}
