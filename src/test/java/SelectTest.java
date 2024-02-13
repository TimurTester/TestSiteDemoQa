import jdk.dynalink.linker.LinkerServices;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import ui.drivers.Driver;
import ui.helper.DropDownHelper;
import ui.helper.WebElementHelper;
import ui.pages.SelectMenuPage;

import java.util.List;

public class SelectTest {

    @Test
    void selectTest(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/select-menu");
        SelectMenuPage selectMenuPage = new SelectMenuPage();
        DropDownHelper dropDownHelper = new DropDownHelper();
        WebElementHelper webElementHelper = new WebElementHelper();

        dropDownHelper.selectByText(selectMenuPage.oldStyleSelectMenu, "Green");

        List<String> list = dropDownHelper.getAllDropDownValues(selectMenuPage.oldStyleSelectMenu);
        list.forEach(System.out::println);

        webElementHelper.sendKeysEnter(selectMenuPage.selectValueInput, "Pro");
    }
}
