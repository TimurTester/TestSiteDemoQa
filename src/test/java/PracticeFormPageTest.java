import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import ui.drivers.Driver;
import ui.helper.BrowserManager;
import ui.helper.WebElementHelper;
import ui.pages.PracticeFormPage;

public class PracticeFormPageTest {
    @Test
    void practiceFormPageTest(){
        BrowserManager browserManager = new BrowserManager(Driver.getDriver());

        browserManager.openByNavigate("https://demoqa.com/automation-practice-form");

        PracticeFormPage practiceFormPageTest = new PracticeFormPage();

        practiceFormPageTest.selectDateMonthYear("5 March 2015");
    }
}
