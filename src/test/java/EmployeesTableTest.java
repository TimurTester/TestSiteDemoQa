import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v119.input.model.DragDataItem;
import org.testng.annotations.Test;
import ui.data.JavaFaker;
import ui.drivers.Driver;
import ui.entity.Employee;
import ui.pages.WebTablePage;

import java.util.List;

public class EmployeesTableTest {

    @Test
    void employeesTableTest(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/webtables");


        Employee randomEmployee = JavaFaker.createNewEmployeeWithFakeData();

        WebTablePage webTablePage = new WebTablePage();

        webTablePage.fillUpTheForm(randomEmployee);

        List<Employee> employees = Employee.getEmployeesFromTable(driver);

        employees.forEach(System.out::println);

        /*int totalSalaryAmount = employees.stream()
                .mapToInt(Employee::getSalary)
                .sum();

        System.out.println(totalSalaryAmount);*/

    }
}
