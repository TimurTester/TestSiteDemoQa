package ui.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.drivers.Driver;

import java.util.LinkedList;
import java.util.Set;

public class WindowHelper {

    public Set<String> getWindowHandles(){
        return Driver.getDriver().getWindowHandles();
    }

    public void switchToWindow(int index){
        LinkedList<String> windowsId = new LinkedList<>(
                getWindowHandles()
        );
        if(index < 0 || index > windowsId.size()){
            throw new IllegalArgumentException("You provide wrong Index " + index);
        }
        Driver.getDriver().switchTo().window(windowsId.get(index));
    }

}
