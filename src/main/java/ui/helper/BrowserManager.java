package ui.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class BrowserManager {

    private WebDriver driver;

    public BrowserManager(WebDriver driver){
        this.driver = driver;
    }

    public void openByNavigate(final String URL){
        driver.navigate().to(URL);
    }

    public void openByGet(final String URL){
        driver.get(URL);
    }

    public void goBack(){
        driver.navigate().back();
    }

    public void goForward(){
        driver.navigate().forward();
    }

    public void refreshThePage(){
        driver.navigate().refresh();
    }
}
