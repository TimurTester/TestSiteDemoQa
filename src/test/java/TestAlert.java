import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ui.drivers.Driver;
import ui.helper.AlertHelper;
import ui.helper.WindowHelper;

import javax.security.auth.login.AccountLockedException;

public class TestAlert {
    @Test
    public void testAlertHelper() throws InterruptedException {
        Driver.getDriver().get("https://demoqa.com/alerts");
        WebElement confirmButton = Driver.getDriver().findElement(By.id("confirmButton"));
        confirmButton.click();
        AlertHelper alertHelper = new AlertHelper();

        alertHelper.acceptAlert();
    }
}
