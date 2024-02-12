import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ui.drivers.Driver;
import ui.helper.WindowHelper;

public class TestWindowHelper {
    @Test
    public void testWindowHelper() throws InterruptedException {
        Driver.getDriver().get("https://demoqa.com/browser-windows");
        WebElement newTab = Driver.getDriver().findElement(By.id("tabButton"));
        for(int i = 0; i < 3; i++){
            newTab.click();
        }
        WindowHelper windowHelper = new WindowHelper();
        windowHelper.switchToWindow(3);
        windowHelper.switchToParentWithChildClose();
    }
}
