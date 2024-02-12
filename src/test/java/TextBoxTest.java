import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.drivers.Driver;
import ui.pages.TextBoxPage;

public class TextBoxTest {

    WebDriver driver;
    TextBoxPage textBoxPage;

    @BeforeClass
    void setUpDriver(){
        driver = Driver.getDriver();
        textBoxPage = new TextBoxPage();
    }

    @Test
    void fillUpTheFormPositiveTest(){


        driver.get("https://demoqa.com/text-box");
        textBoxPage
                .fillUpFullName("Johnny Duly")
                .fillUpEmail("joh@gmail.com")
                .fillUpCurrentAddress("City 32")
                .fillUpPermamentAddress("Sovit 123")
                .clickSubmitBtn();

        String actualName = driver.findElement(By.xpath("//p[@id='name']")).getText();
        String expectedName = "Name:Johnny Duly";

        Assert.assertEquals(expectedName, actualName);
    }
}
