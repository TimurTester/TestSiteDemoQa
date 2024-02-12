package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.drivers.Driver;
import ui.entity.Employee;
import ui.helper.WebElementHelper;

public class WebTablePage {

    private WebDriver driver;
    public WebTablePage(){
        this.driver = Driver.getDriver();
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebTablePage fillUpTheForm(Employee employee){
        WebElementHelper webElementHelper = new WebElementHelper();
        webElementHelper.click(driver.findElement(By.id("addNewRecordButton")))
                .sendKeys(driver.findElement(By.id("firstName")), employee.getFirstName())
                .sendKeys(driver.findElement(By.id("lastName")), employee.getLastName())
                .sendKeys(driver.findElement(By.id("userEmail")), employee.getEmail())
                .sendKeys(driver.findElement(By.id("age")), String.valueOf(employee.getAge()))
                .sendKeys(driver.findElement(By.id("salary")), String.valueOf(employee.getSalary()))
                .sendKeys(driver.findElement(By.id("department")), employee.getDepartment())
                .click(driver.findElement(By.id("submit")));

        return this;
    }
}
