package ui.drivers;

import org.openqa.selenium.WebDriver;
import ui.config.ConfigReader;

public class Driver {
    private Driver(){

    }

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null){
            switch (ConfigReader.getVaue("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    break;
                case "opera":
                    break;
                case "edge":
                    break;
                default:
                    throw new IllegalArgumentException("You provide wrong Driver name");
            }
        }

        return driver;
    }

    public static void closeDriver(){
        try{
            if(driver != null){
                driver.close();
                driver.quit();
                driver = null;
            }
        } catch (Exception e){
            System.out.println("Error while closing driver");
        }
    }

}
