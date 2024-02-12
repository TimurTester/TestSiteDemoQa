import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v119.input.model.DragDataItem;
import org.testng.annotations.Test;
import ui.drivers.Driver;
import ui.entity.Employee;

import java.util.List;

public class EmployeesTableTest {

    @Test
    void employeesTableTest(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/webtables");

        List<Employee> employees = Employee.getEmployeesFromTable(driver);

        employees.forEach(System.out::println);

        int totalSalaryAmount = employees.stream()
                .mapToInt(Employee::getSalary)
                .sum();

        System.out.println(totalSalaryAmount);

    }
}
