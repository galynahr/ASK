package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;

import static support.TestContext.getDriver;

public class userFirstName {
    @Given("I open login page")
    public void iOpenLoginPage() {
        getDriver().get("http://ask-stage.portnov.com/#/login");
    }

    @Given("I open registration page")
    public void iOpenRegistrationPage() {
        getDriver().get("http://ask-stage.portnov.com/#/registration");
    }

    @And("I type first name {string}")
    public void iTypeFirstName(String name) {
        getDriver().findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(name);
    }
}
