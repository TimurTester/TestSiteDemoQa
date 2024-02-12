import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.annotations.Test;
import ui.drivers.Driver;
import ui.helper.FrameHelper;

public class FrameTest {
    @Test
    void frameTest(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/frames");
        FrameHelper frameHelper = new FrameHelper(driver);
        WebElement frameId = driver.findElement(By.id("frame1"));
        frameHelper.switchToFrame(frameId);

        System.out.println(driver.findElement(By.id("sampleHeading")).getText());


    }
}
