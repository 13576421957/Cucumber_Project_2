package AllstepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.DriverClass;
import java.util.List;


public class _70101_Steps extends DriverClass {

    WebDriver driver;

    @Given("User navigate to the parabank Website")
    public void user_navigate_to_the_parabank_website() {
        System.setProperty("webdriver.chrome.driver", "path_to_your_chromedriver");
        driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/");
    }

    @And("website has a connection such as {string} or {string} on its home page")
    public void website_has_a_connection_such_as_on_its_home_page(String link1, String link2) {
        WebElement registerLink = driver.findElement(By.linkText(link1));
        WebElement signUpLink = driver.findElement(By.linkText(link2));
        // Perform actions on the links if needed
    }

    @When("User clicks the {string} link")
    public void user_clicks_the_link(String linkText) {
        WebElement link = driver.findElement(By.linkText(linkText));
        link.click();
    }

    @And("the user fills the fields on the screen with the following details")
    public void the_user_fills_the_fields_on_the_screen_with_the_following_details(List<List<String>> dataTable) {
        for (List<String> row : dataTable) {
            WebElement firstName = driver.findElement(By.id("firstName"));
            WebElement lastName = driver.findElement(By.id("lastName"));
            WebElement address = driver.findElement(By.id("address"));
            WebElement city = driver.findElement(By.id("city"));
            WebElement state = driver.findElement(By.id("state"));
            WebElement zipCode = driver.findElement(By.id("zipCode"));
            WebElement phone = driver.findElement(By.id("phone"));
            WebElement ssn = driver.findElement(By.id("ssn"));
            WebElement username = driver.findElement(By.id("username"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement confirm = driver.findElement(By.id("confirmPassword"));

            firstName.sendKeys(row.get(0));
            lastName.sendKeys(row.get(1));
            address.sendKeys(row.get(2));
            city.sendKeys(row.get(3));
            state.sendKeys(row.get(4));
            zipCode.sendKeys(row.get(5));
            phone.sendKeys(row.get(6));
            ssn.sendKeys(row.get(7));
            username.sendKeys(row.get(8));
            password.sendKeys(row.get(9));
            confirm.sendKeys(row.get(10));
        }
    }

    @And("the user clicks the {string} button")
    public void the_user_clicks_the_button(String buttonText) {
        WebElement button = driver.findElement(By.xpath("//input[@value='" + buttonText + "']"));
        button.click();
    }

    @Then("user confirms that a successful registration process has taken place")
    public void user_confirms_that_a_successful_registration_process_has_taken_place() {
        WebElement successMessage = driver.findElement(By.xpath("//*[contains(text(), 'Your Account Was Created Successfully. You are now.')]"));
        // Add assertion or validation for the success message
    }

    @And("user, {string} sees a message like")
    public void user_sees_a_message_like(String userName, String message) {
        WebElement messageElement = driver.findElement(By.xpath("//*[contains(text(), '" + message + "')]"));
        // Add assertion or validation for the message
    }

    @And("the user will enter the system with the information he entered during the registration")
    public void the_user_will_enter_the_system_with_the_information_he_entered_during_the_registration() {
        // Add steps to enter the system
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();

        }
    }
}
